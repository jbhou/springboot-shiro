package com.test.springboot.shiro.configure;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.test.springboot.shiro.constant.UserAccountStatus;
import com.test.springboot.shiro.constant.UserLoginStatus;
import com.test.springboot.shiro.dao.entity.UserEntity;
import com.test.springboot.shiro.dao.result.bean.RoleVoBean;
import com.test.springboot.shiro.dao.result.bean.UserVoBean;
import com.test.springboot.shiro.service.UserService;
import com.test.springboot.shiro.util.MD5Util;

@Configuration
public class ShiroRealm extends AuthorizingRealm {
    public String getName() {
        return "ShiroRealm";
    }

    /** 注解引入业务类 **/
    @Autowired
    private UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal(); // 得到用户名
        String password = new String((char[]) token.getCredentials()); // 得到密码
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginUsername(username);
        userEntity.setLoginPassword(MD5Util.getMD5(password));
        userEntity = userService.findByUsername(userEntity);
        UserVoBean userVoBean = UserVoBean.fromEntity(userEntity);
        userVoBean.setFlag(UserLoginStatus.SUCCESS);
        userVoBean.setFlagMessage(UserLoginStatus.SUCCESS_MESSAGE);
        /** 检测是否有此用户 **/
        if (userEntity == null) {
            throw new UnknownAccountException();// 没有找到账号异常
        }
        /** 检验账号是否被锁定 **/
        if (UserAccountStatus.STOP == userEntity.getAccountStatus() || UserAccountStatus.DELETED == userEntity.getAccountStatus()) {
            throw new LockedAccountException();// 抛出账号锁定异常
        }
        /** AuthenticatingRealm使用Credential sMatcher进行密码匹配 **/
        if (null != username && null != password) {
            System.out.println(new SimpleAuthenticationInfo(userEntity, password, getName()));
            return new SimpleAuthenticationInfo(userVoBean, password, getName());
        } else {
            return null;
        }
    }

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法(non-Javadoc)
     * 
     * @see AuthorizingRealm#doGetAuthorizationInfo(PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
        UserVoBean userVoBean = (UserVoBean) pc.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        RoleVoBean role = userService.getApiPermissionByUserId(userVoBean.getUserId());
        authorizationInfo.addRole(role.getRoleName());
        List<String> permissions = role.getPermissions()//
                .stream()//
                .map(p -> {
                    return p.getResource() + ":" + p.getPermission();
                })//
                .collect(Collectors.toList());
        authorizationInfo.addStringPermissions(permissions);
        return authorizationInfo;
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }
}
