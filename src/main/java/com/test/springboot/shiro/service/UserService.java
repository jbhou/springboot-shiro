package com.test.springboot.shiro.service;

import java.util.List;

import com.test.springboot.shiro.dao.PermissionDao;
import com.test.springboot.shiro.dao.UserDao;
import com.test.springboot.shiro.dao.entity.ResourceOperationEntity;
import com.test.springboot.shiro.dao.entity.UserEntity;
import com.test.springboot.shiro.dao.result.bean.RoleVoBean;
import com.test.springboot.shiro.dao.result.bean.UserPermissionVoBean;
import com.test.springboot.shiro.dao.result.bean.UserVoBean;
import com.test.springboot.shiro.util.MD5Util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author superxiaojie
 *         2018-5-18.
 */
@Service
public class UserService {



    @Autowired
    private UserDao userDao;

    @Autowired
    private PermissionDao permissDao;
    
    
    public UserPermissionVoBean gerUserPermissions(int userId) {
        // TODO Auto-generated method stub
        return userDao.getUserPermissionByUserId(userId);
    }

    public UserEntity findByUsername(UserEntity userEntity) {
        return userDao.getUser(userEntity);
    }

    public  RoleVoBean getApiPermissionByUserId(int userId) {
        // TODO Auto-generated method stub
        
        return permissDao.getApiPermissionByUserId(userId);
    }
}
