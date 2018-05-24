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

import java.util.Date;

/**
 * ClassName:WorkshopVoBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月22日 下午2:16:59 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class WorkshopVoBean {
    private int workshopId;
    private Date createTime;
    private String workshopName;
    private String descInfo;
    private Date lastModifyTime;
    private UserVoBean personLiable;

    public int getWorkshopId() {
        return workshopId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public String getDescInfo() {
        return descInfo;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public UserVoBean getPersonLiable() {
        return personLiable;
    }

    public void setWorkshopId(int workshopId) {
        this.workshopId = workshopId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public void setPersonLiable(UserVoBean personLiable) {
        this.personLiable = personLiable;
    }

    @Override
    public String toString() {
        return "WorkshopVoBean [workshopId=" + workshopId + ", createTime=" + createTime + ", workshopName=" + workshopName + ", descInfo=" + descInfo + ", lastModifyTime="
                + lastModifyTime + ", personLiable=" + personLiable + "]";
    }

}
