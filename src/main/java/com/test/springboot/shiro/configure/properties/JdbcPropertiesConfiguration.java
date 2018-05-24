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
package com.test.springboot.shiro.configure.properties;

import static org.junit.Assert.assertNotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * ClassName:JdbcPropertiesConfiguration <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月18日 下午2:49:21 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Component
@ConfigurationProperties(prefix = "jdbc")
public class JdbcPropertiesConfiguration {
    public static final int DEFAULT_MAXIDLETIME = 20;
    public static final int DEFAULT_MAXPOOLSIZE = 20;
    public static final int DEFAULT_INITALPOOLSIZE = 20;
    private String driver;
    private String username;
    private String password;
    private String url;
    private int maxIdletime;
    private int maxPoolSize;
    private int initalPoolSize;

    public String getDriver() {
        assertNotNull("Jdbc driver can't be null,set jdbc.driver in application.properties", driver);
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException("The config value of jdbc.driver error!", e);
        }
        return driver;
    }

    public String getUsername() {
        assertNotNull("Jdbc username can't be null,set jdbc.username in application.properties", driver);
        return username;
    }

    public String getPassword() {
        assertNotNull("Jdbc password can't be null,set jdbc.password in application.properties", driver);
        return password;
    }

    public String getUrl() {
        assertNotNull("Jdbc url can't be null,set jdbc.url in application.properties", driver);
        return url;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMaxIdletime() {
        return maxIdletime > 0 ? maxIdletime : DEFAULT_MAXIDLETIME;
    }

    public int getMaxPoolSize() {
        return maxPoolSize > 0 ? maxPoolSize : DEFAULT_MAXPOOLSIZE;
    }

    public int getInitalPoolSize() {
        return initalPoolSize > 0 ? initalPoolSize : DEFAULT_INITALPOOLSIZE;
    }

    public void setMaxIdletime(int maxIdletime) {
        this.maxIdletime = maxIdletime;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public void setInitalPoolSize(int initalPoolSize) {
        this.initalPoolSize = initalPoolSize;
    }
}
