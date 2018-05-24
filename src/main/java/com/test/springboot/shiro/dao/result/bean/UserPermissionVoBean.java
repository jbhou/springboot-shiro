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
 * ClassName:UserPermissionResult <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月21日 下午3:46:48 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class UserPermissionVoBean {
    private int userId;
    private List<ViewMenuVoBean> menus;
    private List<ResourceOperationVoBean> resourceOperations;

    public int getUserId() {
        return userId;
    }

    public List<ViewMenuVoBean> getMenus() {
        return menus;
    }

    public List<ResourceOperationVoBean> getResourceOperations() {
        return resourceOperations;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setMenus(List<ViewMenuVoBean> menus) {
        this.menus = menus;
    }

    public void setResourceOperations(List<ResourceOperationVoBean> resourceOperations) {
        this.resourceOperations = resourceOperations;
    }
}
