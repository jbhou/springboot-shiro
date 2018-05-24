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
package com.test.springboot.shiro.boostrap;

import java.lang.management.ManagementFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.test.springboot.shiro.env.RuntimeEnvironment;

/**
 * ClassName:SmtServer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月17日 下午2:35:19 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.test.springboot.shiro")
public class SmtServer {
    private Logger logger;
    private SpringApplication application;
    private static final String SPRING_CONFIG_LOCATION = "spring.config.location";

    public static void main(String[] args) {
        SmtServer server = new SmtServer();
        server.start(args);
    }

    public void stop() {
        
    }

    /**
     * 
     * start:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     *
     * @author lenovo
     * @param args
     */
    public void start(String[] args) {
        logger = LoggerFactory.getLogger(getClass());
        application = new SpringApplicationBuilder(SmtServer.class)//
                .build();
        application.run(args);
    }

    public long getPid() {
        final String name = ManagementFactory.getRuntimeMXBean().getName();
        try {
            return Long.parseLong(name.split("@")[0]);
        } catch (final NumberFormatException e) {
            logger.error(e.getMessage(), e);
            return -1;
        }
    }
}
