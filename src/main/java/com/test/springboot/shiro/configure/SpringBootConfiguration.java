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
package com.test.springboot.shiro.configure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.springboot.shiro.env.RuntimeEnvironment;
import com.test.springboot.shiro.filter.SMTAuthorizationFilter;

/**
 * ClassName:FilterConfig <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月17日 下午5:52:07 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
@Configuration
public class SpringBootConfiguration {
    @Bean
    public HttpMessageConverters gsonConverters() {
        Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        gsonHttpMessageConverter.setGson(gson);
        messageConverters.add(gsonHttpMessageConverter);
        return new HttpMessageConverters(false, messageConverters);
    }

    @Bean
    public RuntimeEnvironment runtimeEnvironment() {
        return RuntimeEnvironment.getRuntimeEnvironment();
    }

    @Bean
    public FilterRegistrationBean<SMTAuthorizationFilter> logFilterRegistration() {
        FilterRegistrationBean<SMTAuthorizationFilter> registration = new FilterRegistrationBean<SMTAuthorizationFilter>(new SMTAuthorizationFilter());
        registration.addUrlPatterns("/rest/v1/*");
        return registration;
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }

  

    
    
//    @Bean
//    public CacheManager cacheManager() {
//        SimpleCacheManager cacheManager = new SimpleCacheManager();
//        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("workorder")));
//        return cacheManager;
//    }
}
