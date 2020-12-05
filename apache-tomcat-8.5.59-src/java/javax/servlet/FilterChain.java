/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.servlet;

import java.io.IOException;

/**
 * 过滤器链是由servlet容器提供到显影剂给予视图到对资源的​​请求过滤的调用链中的对象。
 * 过滤器使用的过滤器链来调用下一个过滤器链，
 * 或者如果调用过滤器链中的最后一个过滤器，以在链的末端调用资源
 * A FilterChain is an object provided by the servlet container to the developer
 * giving a view into the invocation chain of a filtered request for a resource.
 * Filters use the FilterChain to invoke the next filter in the chain, or if the
 * calling filter is the last filter in the chain, to invoke the resource at the
 * end of the chain.
 *
 * @see Filter
 * @since Servlet 2.3
 **/

public interface FilterChain {

    /**
     * Causes the next filter in the chain to be invoked, or if the calling
     * filter is the last filter in the chain, causes the resource at the end of
     * the chain to be invoked.
     *
     * @param request
     *            the request to pass along the chain.
     * @param response
     *            the response to pass along the chain.
     *
     * @throws IOException if an I/O error occurs during the processing of the
     *                     request
     * @throws ServletException if the processing fails for any other reason

     * @since 2.3
     */
    public void doFilter(ServletRequest request, ServletResponse response)
            throws IOException, ServletException;

}
