/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.test.springboot.shiro.dao;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.springboot.shiro.constant.ApiStatus;
import com.test.springboot.shiro.dao.entity.ResourceOperationEntity;
import com.test.springboot.shiro.dao.entity.ResourceOperationEntityExample;
import com.test.springboot.shiro.dao.entity.mapper.ResourceOperationEntityMapper;
import com.test.springboot.shiro.dao.result.bean.PermissionVoBean;
import com.test.springboot.shiro.dao.result.bean.RoleVoBean;

/**
 * ClassName:PermissionDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月24日 下午3:20:02 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Repository
//
public class PermissionDao extends BaseDao {
    @Autowired
    private Gson gson;
    @Autowired
    private ResourceOperationEntityMapper resourceOperationEntityMapper;

    public RoleVoBean getApiPermissionByUserId(int userId) {
        // TODO Auto-generated method stub
        // PermissionMapper
        Map<String, Object> map = getSqlSession().selectOne("getRoleAccessResourceIds", userId);
        String idStr = (String) map.get("resourceIds");
        int roleId = (int) map.get("id");
        String roleName = (String) map.get("roleName");
        Type type = new TypeToken<List<Integer>>() {
        }.getType();
        List<Integer> resourceIds = gson.fromJson(idStr, type);
        ResourceOperationEntityExample example = new ResourceOperationEntityExample();
        example.createCriteria().andApiStatusEqualTo(ApiStatus.INUSE).andIdIn(resourceIds);
        List<ResourceOperationEntity> entities = resourceOperationEntityMapper.selectByExample(example);
        List<PermissionVoBean> permissionVoBeans = entities//
                .stream()//
                .map(e -> {
                    PermissionVoBean p = new PermissionVoBean();
                    p.setPermission(e.getPermission());
                    p.setResource(e.getResourceType());
                    p.setPermissionId(e.getId());
                    return p;
                }).collect(Collectors.toList());
        RoleVoBean voBean = new RoleVoBean();
        voBean.setRoleId(roleId);
        voBean.setRoleName(roleName);
        voBean.setPermissions(permissionVoBeans);
        return voBean;
    }
}
