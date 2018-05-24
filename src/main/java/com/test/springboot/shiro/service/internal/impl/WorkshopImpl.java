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
import com.test.springboot.shiro.dao.ProductLineDao;
import com.test.springboot.shiro.dao.WorkshopDao;
import com.test.springboot.shiro.dao.entity.ProductLineEntity;
import com.test.springboot.shiro.dao.entity.WorkshopEntity;
import com.test.springboot.shiro.dao.result.bean.WorkshopVoBean;
import com.test.springboot.shiro.service.internal.ProductLine;
import com.test.springboot.shiro.service.internal.User;
import com.test.springboot.shiro.service.internal.Workshop;
import com.test.springboot.shiro.service.internal.factory.ProductLineFactory;

/**
 * ClassName:WorkshopImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午7:32:30 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class WorkshopImpl implements Workshop {
    private final Map<Integer, ProductLine> productLines = Maps.newConcurrentMap();
    private final ProductLineFactory productLineFactory;
    private final WorkshopDao workShopDao;
    private final ProductLineDao productLineDao;
    private final WorkshopEntity workshopEntity;

    public WorkshopImpl(ProductLineFactory productLineFactory, WorkshopDao workShopDao, ProductLineDao productLineDao, WorkshopEntity workshopEntity) {
        super();
        this.productLineFactory = productLineFactory;
        this.workShopDao = workShopDao;
        this.productLineDao = productLineDao;
        this.workshopEntity = workshopEntity;
    }

    @Override
    public List<ProductLine> getProductLines() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductLine getProductLine(int productLineId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WorkshopVoBean toViewBean() {
        // TODO Auto-generated method stub
        WorkshopVoBean viewBean = new WorkshopVoBean();
        return viewBean;
    }

    @Override
    public void persist() {
        // TODO Auto-generated method stub
    }

    @Override
    public User getPersonLiable() {
        return null;
    }

    @Override
    public void addProductLine(ProductLine productLine) {
        // TODO Auto-generated method stub
    }

    public void loadProductLines() {
        List<ProductLineEntity> productLineEntities = productLineDao.getProductLinesByWorkshopId(workshopEntity.getId());
        productLineEntities.stream().forEach(productLineEntity -> {
            productLines.put(productLineEntity.getId(), productLineFactory.createProductLine(this, productLineEntity));
        });
    }
}
