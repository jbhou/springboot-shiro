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
package com.test.springboot.shiro.service.impl;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.test.springboot.shiro.dao.WorkshopDao;
import com.test.springboot.shiro.dao.result.bean.WorkshopVoBean;
import com.test.springboot.shiro.service.WorkshopService;
import com.test.springboot.shiro.service.internal.Workshop;
import com.test.springboot.shiro.service.internal.factory.WorkshopFactory;

/**
 * ClassName:WorkshopService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月17日 下午4:42:00 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Service
public class WorkshopServiceImpl implements WorkshopService {
    private final WorkshopDao workshopDao;
    private LoadingCache<Integer, Workshop> workshopCache;
    @Autowired
    private WorkshopFactory workshopFactory;

    @Autowired
    public WorkshopServiceImpl(WorkshopDao workshopDao) {
        this.workshopDao = workshopDao;
        workshopCache = CacheBuilder.newBuilder()//
                .maximumSize(100)//
                .refreshAfterWrite(10, TimeUnit.MINUTES)//
                .build(new CacheLoader<Integer, Workshop>() {
                    @Override
                    public Workshop load(Integer workShopId) throws Exception {
                        return loadWorkshop(workShopId);
                    }
                });
    }

    private Workshop loadWorkshop(int workshopId) {
        return workshopFactory.createWorkshop(workshopId);
    }

    @Override
    public List<WorkshopVoBean> listWorkshops() {
        List<WorkshopVoBean> r = workshopDao.list();
        return r;
    }

    @Override
    public WorkshopVoBean getWorkshop(int workshopId) {
        Workshop workShop;
        try {
            workShop = workshopCache.get(workshopId);
            if (workShop != null) {
                return workShop.toViewBean();
            }else{
                
                return null;
                
                
            }
            
            
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            return null;
        }
       
    }
}
