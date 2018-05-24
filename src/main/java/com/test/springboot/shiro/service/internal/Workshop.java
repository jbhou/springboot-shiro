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
package com.test.springboot.shiro.service.internal;

import java.util.List;

import com.test.springboot.shiro.dao.entity.WorkshopEntity;
import com.test.springboot.shiro.dao.result.bean.WorkshopVoBean;

/**
 * ClassName:Workshop <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午6:25:28 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public interface Workshop {
    

    
    public List<ProductLine> getProductLines();
    
    public ProductLine getProductLine(int productLineId);
    
    public WorkshopVoBean toViewBean();

    public void persist();
    
    public User getPersonLiable();

    void addProductLine(ProductLine productLine);

    
}
