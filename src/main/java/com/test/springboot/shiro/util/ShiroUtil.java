package com.test.springboot.shiro.util;

import com.test.springboot.shiro.dao.entity.UserEntity;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;


/**
 */
public class ShiroUtil {
    public static void getUserRole(){
        Subject subject = SecurityUtils.getSubject();
        UserEntity userEntity = (UserEntity) subject.getPrincipal();
        subject.isPermitted(userEntity.toString());
    }
}
