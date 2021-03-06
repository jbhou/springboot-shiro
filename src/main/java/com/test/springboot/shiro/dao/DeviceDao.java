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
package com.test.springboot.shiro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.springboot.shiro.dao.entity.DeviceEntity;
import com.test.springboot.shiro.dao.entity.DeviceEntityExample;
import com.test.springboot.shiro.dao.entity.mapper.DeviceEntityMapper;

/**
 * ClassName:DeviceDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午7:44:38 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Repository
public class DeviceDao extends BaseDao {
    @Autowired
    private DeviceEntityMapper deviceMapper;

    public List<DeviceEntity> getDevicesByProductLineId(Integer productLineId) {
        // TODO Auto-generated method stub
        DeviceEntityExample example = new DeviceEntityExample();
        example.createCriteria().andProductLineIdEqualTo(productLineId);
        return deviceMapper.selectByExample(example);
    }
}
