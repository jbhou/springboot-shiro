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

import com.google.common.collect.Lists;
import com.test.springboot.shiro.dao.entity.ResourceOperationEntity;

import java.util.List;

/**
 * ClassName:ResourceOperation <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月21日 下午3:48:28 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class ResourceOperationVoBean {
    private String resource;
    private List<OperationVoBean> operations = Lists.newArrayList();

    public String getResource() {
        return resource;
    }

    public List<OperationVoBean> getOperations() {
        return operations;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setOperations(List<OperationVoBean> operations) {
        this.operations = operations;
    }

    public void addOperation(OperationVoBean ov) {
        this.operations.add(ov);
    }

    public static ResourceOperationVoBean fromEntity(ResourceOperationEntity entity) {
        ResourceOperationVoBean r = new ResourceOperationVoBean();
        r.setResource(entity.getResourceType());
        r.addOperation(new OperationVoBean(entity.getOperationType(), entity.getId()));
        return r;
    }
}
