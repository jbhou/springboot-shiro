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
package com.test.springboot.shiro.service.internal.impl;

import com.test.springboot.shiro.dao.DeviceDao;
import com.test.springboot.shiro.dao.entity.DeviceEntity;
import com.test.springboot.shiro.dao.result.bean.DeviceVoBean;
import com.test.springboot.shiro.service.internal.Device;
import com.test.springboot.shiro.service.internal.ProductLine;
import com.test.springboot.shiro.service.internal.User;
import com.test.springboot.shiro.service.internal.Workshop;

/**
 * ClassName:DeviceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午7:34:03 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class DeviceImpl implements Device {
    private final DeviceDao deviceDao;
    private final DeviceEntity entity;
    private ProductLine productLine;

    public DeviceImpl(DeviceDao deviceDao, DeviceEntity entity, ProductLine productLine) {
        super();
        this.deviceDao = deviceDao;
        this.entity = entity;
        this.productLine = productLine;
    }

    @Override
    public Workshop getWorkshop() {
        // TODO Auto-generated method stub
        return productLine.getWorkshop();
    }

    @Override
    public ProductLine getProductLine() {
        // TODO Auto-generated method stub
        return productLine;
    }

    @Override
    public void persist() {
        // TODO Auto-generated method stub
    }

    @Override
    public DeviceVoBean toViewBean() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getPersonLiable() {
        // TODO Auto-generated method stub
        return null;
    }
}
