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

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.test.springboot.shiro.dao.DeviceDao;
import com.test.springboot.shiro.dao.ProductLineDao;
import com.test.springboot.shiro.dao.entity.DeviceEntity;
import com.test.springboot.shiro.dao.entity.ProductLineEntity;
import com.test.springboot.shiro.dao.result.bean.ProductLineVoBean;
import com.test.springboot.shiro.service.internal.Device;
import com.test.springboot.shiro.service.internal.ProductLine;
import com.test.springboot.shiro.service.internal.User;
import com.test.springboot.shiro.service.internal.Workshop;
import com.test.springboot.shiro.service.internal.factory.DeviceFactory;

/**
 * ClassName:ProductLineImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午7:33:54 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class ProductLineImpl implements ProductLine {
    private final Map<Integer, Device> devices = Maps.newConcurrentMap();
    private final DeviceDao deviceDao;
    private final DeviceFactory deviceFactory;
    private final ProductLineDao productLineDao;
    private final ProductLineEntity entity;
    private Workshop workshop;
    private User personLiable;

    public ProductLineImpl(DeviceFactory deviceFactory, ProductLineDao productLineDao,DeviceDao deviceDao, ProductLineEntity entity, Workshop workshop) {
        super();
        this.deviceFactory = deviceFactory;
        this.productLineDao = productLineDao;
        this.deviceDao=deviceDao;
        this.entity = entity;
        this.workshop = workshop;
    }

    @Override
    public Workshop getWorkshop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Device getDevice() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Device> getDevices() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductLineVoBean toViewBean() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void persist() {
        // TODO Auto-generated method stub
    }

    @Override
    public void addDevice() {
        // TODO Auto-generated method stub
    }

    public void loadDevices() {
        // TODO Auto-generated method stub
      List<DeviceEntity> deviceEntities=  deviceDao.getDevicesByProductLineId(this.entity.getId());
   
      deviceEntities.stream().forEach(device->{
          
          devices.put(device.getId(),deviceFactory.createDevice(this,device));
          
          
          
      });
      
    }

    @Override
    public User getPersonLiable() {
        // TODO Auto-generated method stub
        return personLiable;
    }
}
