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
package com.test.springboot.shiro.service.internal.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.springboot.shiro.dao.DeviceDao;
import com.test.springboot.shiro.dao.ProductLineDao;
import com.test.springboot.shiro.dao.entity.ProductLineEntity;
import com.test.springboot.shiro.service.internal.ProductLine;
import com.test.springboot.shiro.service.internal.Workshop;
import com.test.springboot.shiro.service.internal.annotation.Factory;
import com.test.springboot.shiro.service.internal.impl.ProductLineImpl;

/**
 * ClassName:ProductLineFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午7:18:35 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Factory(target = ProductLine.class)
public class ProductLineFactory {
    @Autowired
    private DeviceFactory deviceFactory;
    @Autowired
    private ProductLineDao productLineDao;
    @Autowired
    private DeviceDao deviceDao;

    public ProductLine createProductLine(Workshop workshop, ProductLineEntity productLineEntity) {
        // TODO Auto-generated method stub
        ProductLineImpl productLine = new ProductLineImpl(deviceFactory, productLineDao, deviceDao, productLineEntity, workshop);
        productLine.loadDevices();
        return productLine;
    }
}
