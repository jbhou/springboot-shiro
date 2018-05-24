package com.test.springboot.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.shiro.service.UserService;

/**
 * @author superxiaojie 2018-5-18.
 */
@RestController
@RequestMapping("/rest/v1/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public RestApiResult login(UserEntity userEntity) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userEntity.getLoginUsername(), userEntity.getLoginPassword(), false);
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            UserVoBean userVoBean = new UserVoBean();
            userVoBean.setFlag(UserLoginStatus.ERROR);
            userVoBean.setFlagMessage(UserLoginStatus.ERROR_MESSAGE);
            return doService(() -> userVoBean);
        } catch (LockedAccountException e) {
            UserVoBean userVoBean = new UserVoBean();
            userVoBean.setFlag(UserLoginStatus.ERROR);
            userVoBean.setFlagMessage(UserLoginStatus.STOP_MESSAGE);
            return doService(() -> userVoBean);
        }
        UserVoBean userVoBean  = (UserVoBean) subject.getPrincipal();
        return doService(() -> userVoBean);
    }

    @GetMapping("/{userId}/permission")
    @RequiresPermissions("PERMISSION:GET")
    public RestApiResult getUserPermission(@PathVariable(name = "userId") int userId) {
        return doService(() -> userService.gerUserPermissions(userId));
    }

    @GetMapping("/logout")
    public void logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
        }
    }
}
