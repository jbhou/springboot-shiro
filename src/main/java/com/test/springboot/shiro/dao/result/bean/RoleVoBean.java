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
package com.test.springboot.shiro.dao.result.bean;

import java.util.List;

/**
 * ClassName:RolePermissionVoBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月24日 下午3:23:14 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class RoleVoBean {
    private String roleName;
    private List<PermissionVoBean> permissions;
    private int roleId;

    public String getRoleName() {
        return roleName;
    }

    public List<PermissionVoBean> getPermissions() {
        return permissions;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setPermissions(List<PermissionVoBean> permissions) {
        this.permissions = permissions;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "RolePermissionVoBean [roleName=" + roleName + ", roleId=" + roleId + "]";
    }
}
