package com.test.springboot.shiro.dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.springboot.shiro.dao.entity.*;
import com.test.springboot.shiro.dao.entity.mapper.ResourceOperationEntityMapper;
import com.test.springboot.shiro.dao.entity.mapper.UserEntityMapper;
import com.test.springboot.shiro.dao.entity.mapper.ViewMenuEntityMapper;
import com.test.springboot.shiro.dao.result.bean.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao extends BaseDao {
    @Autowired
    private UserEntityMapper userEntityMapper;
    @Autowired
    private ViewMenuEntityMapper menuMapper;
    @Autowired
    private ResourceOperationEntityMapper resourceMapper;
    @Autowired
    private Gson gson;

    public UserEntity getUser(UserEntity userEntity) {
        return getSqlSession().selectOne("getUser",userEntity);
    }

    public UserPermissionVoBean getUserPermissionByUserId(int userId) {
        // TODO Auto-generated method stub
        Map<String, String> result = getSqlSession().selectOne("getUserPermissionIds", userId);
        Type type = new TypeToken<List<Integer>>() {
        }.getType();
        List<Integer> menuIds = gson.fromJson(result.get("menuIds"), type);
        List<Integer> resourceIds = gson.fromJson(result.get("resourceIds"), type);
        ViewMenuEntityExample viewExample = new ViewMenuEntityExample();
        viewExample.createCriteria().andIdIn(menuIds);
        List<ViewMenuEntity> menus = menuMapper.selectByExample(viewExample);
        ResourceOperationEntityExample resourceExample = new ResourceOperationEntityExample();
        resourceExample.createCriteria().andIdIn(resourceIds);
        List<ResourceOperationEntity> resources = resourceMapper.selectByExample(resourceExample);
        UserPermissionVoBean permissionVoBean = new UserPermissionVoBean();
        permissionVoBean.setUserId(userId);
        permissionVoBean.setMenus(transferMenus(menus));
        permissionVoBean.setResourceOperations(transferResourceOperations(resources));
        return permissionVoBean;
    }

    private List<ResourceOperationVoBean> transferResourceOperations(List<ResourceOperationEntity> resources) {
        // TODO Auto-generated method stub
        Map<String, ResourceOperationVoBean> resourceMap = Maps.newHashMap();
        resources.stream()//
                .forEach(e -> {
                    if (resourceMap.containsKey(e.getResourceType())) {
                        resourceMap.get(e.getResourceType()).addOperation(new OperationVoBean(e.getOperationType(), e.getId()));
                    } else {
                        resourceMap.put(e.getResourceType(), ResourceOperationVoBean.fromEntity(e));
                    }
                });
        return Lists.newArrayList(resourceMap.values());
    }

    private List<ViewMenuVoBean> transferMenus(List<ViewMenuEntity> menus) {
        // TODO Auto-generated method stub
        Map<Integer, ViewMenuVoBean> rootMenus = Maps.newHashMap();
        menus.stream()//
                .filter(menu -> menu.getParentMenuId() == 0)//
                .map(menu -> {
                    return ViewMenuVoBean.fromEntity(menu);
                })//
                .forEach(menuVo -> rootMenus.put(menuVo.getId(), menuVo));
        menus.stream()//
                .filter(menu -> menu.getParentMenuId() > 0)//
                .forEach(menu -> {
                    rootMenus.get(menu.getParentMenuId()).addChildMenu(ViewMenuVoBean.fromEntity(menu));
                });
        return Lists.newArrayList(rootMenus.values());
    }


}
