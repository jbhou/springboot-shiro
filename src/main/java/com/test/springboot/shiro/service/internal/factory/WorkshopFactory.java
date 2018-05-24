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

import com.test.springboot.shiro.dao.ProductLineDao;
import com.test.springboot.shiro.dao.WorkshopDao;
import com.test.springboot.shiro.dao.entity.WorkshopEntity;
import com.test.springboot.shiro.service.internal.Workshop;
import com.test.springboot.shiro.service.internal.annotation.Factory;
import com.test.springboot.shiro.service.internal.impl.WorkshopImpl;

/**
 * ClassName:WorkshopFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午7:18:55 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Factory(target = Workshop.class)
public class WorkshopFactory {
    @Autowired
    private WorkshopDao workshopDao;
    @Autowired
    private ProductLineDao productLineDao;
    
    @Autowired
    private ProductLineFactory productLineFactory;
    
    public Workshop createWorkshop() {
        // TODO Auto-generated method stub
        return null;
    }

    public Workshop createWorkshop(int workshopId) {
        // TODO Auto-generated method stub
        WorkshopEntity workshopEntity = workshopDao.getWorkShop(workshopId);
        if (workshopEntity == null) {
            return null;
        } else {
            WorkshopImpl workshop = new WorkshopImpl(productLineFactory,workshopDao,productLineDao,workshopEntity);
            workshop.loadProductLines();
            return workshop;
        }
    }
}
