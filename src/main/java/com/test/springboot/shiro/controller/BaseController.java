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
package com.test.springboot.shiro.controller;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.springboot.shiro.service.WorkshopService;

/**
 * ClassName:BaseService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月17日 下午5:59:35 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public abstract class BaseController {
    Logger logger = LoggerFactory.getLogger(getClass());

    
    @Autowired
    private WorkshopService workshopService;

    protected WorkshopService getWorkshopService() {
        return workshopService;
    }
    
    
    
    public RestApiResult doService(Function<Object,Object> fun, Object t) {
        try {
            return RestApiResult.createSuccessResult(fun.apply(t));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return RestApiResult.createFailedResult(RestApiErrorResult.SYS_EXCEPTION);
        }
    }

    public RestApiResult doService(NoArgsFunction fun) {
        try {
            return RestApiResult.createSuccessResult(fun.apply());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return RestApiResult.createFailedResult(RestApiErrorResult.SYS_EXCEPTION);
        }
    }
}
