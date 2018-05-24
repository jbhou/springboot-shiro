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

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.test.springboot.shiro.configure.properties.JdbcPropertiesConfiguration;

/**
 * ClassName:MyBatis <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * 
 * @author jbhou
 * @version 1.0.0
 * @see
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.test.springboot.shiro.dao.entity.mapper")
public class JdbcConfiguration implements TransactionManagementConfigurer {

    
    @Autowired
    JdbcPropertiesConfiguration jdbcConfig;
    
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass(jdbcConfig.getDriver());
            ds.setJdbcUrl(jdbcConfig.getUrl());
            ds.setUser(jdbcConfig.getUsername());
            ds.setPassword(jdbcConfig.getPassword());
            ds.setInitialPoolSize(jdbcConfig.getInitalPoolSize());
            ds.setTestConnectionOnCheckin(true);
            ds.setTestConnectionOnCheckout(true);
            ds.setMaxIdleTime(jdbcConfig.getMaxIdletime());
            ds.setMaxPoolSize(jdbcConfig.getMaxPoolSize());
            return ds;
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier("dataSource")DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*/*.xml"));
            SqlSessionFactory sq = bean.getObject();
            return sq;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "sqlSessionTemplate")
    @Autowired
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        SqlSessionTemplate sql = new SqlSessionTemplate(sqlSessionFactory);
        return sql;
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
