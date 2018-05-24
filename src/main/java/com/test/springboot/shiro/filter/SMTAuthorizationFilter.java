
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.test.springboot.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * ClassName:SMTAuthorization <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:     TODO ADD REASON. <br/>
 * Date:     2018年5月21日 下午6:07:31 <br/>
 * @author   lenovo
 * @version 1.0.0
 * @see
 */
public class SMTAuthorizationFilter extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        // TODO Auto-generated method stub
        
        System.err.println(((HttpServletRequest)request).getRequestURI());
        Subject subject  =   getSubject(request, response);
        System.err.println(subject.getPrincipal());
        return false;
    }
}
