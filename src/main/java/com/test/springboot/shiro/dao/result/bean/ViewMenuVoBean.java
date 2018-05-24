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

import java.util.List;

import com.google.common.collect.Lists;
import com.test.springboot.shiro.dao.entity.ViewMenuEntity;

/**
 * ClassName:ViewMenuVoBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月21日 下午3:50:32 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class ViewMenuVoBean {
    private int id;
    private String label;
    private String menuName;
    private List<ViewMenuVoBean> childMenus = Lists.newArrayList();

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<ViewMenuVoBean> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<ViewMenuVoBean> childMenus) {
        this.childMenus = childMenus;
    }

    public void addChildMenu(ViewMenuVoBean child) {
        this.childMenus.add(child);
    }

    public static ViewMenuVoBean fromEntity(ViewMenuEntity entity) {
        ViewMenuVoBean bean = new ViewMenuVoBean();
        bean.setId(entity.getId());
        bean.setLabel(entity.getMenuLabel());
        bean.setMenuName(entity.getMenuName());
        return bean;
    }
}
