/*
 * Copyright (C) 2012~2016 dinstone<dinstone@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dinstone.jrpc.service;

import com.dinstone.jrpc.protocol.Request;
import com.dinstone.jrpc.protocol.Response;

/**
 * RPC service handler.
 * 
 * @author guojinfei
 * @version 1.0.0.2014-7-29
 */
public interface ServiceHandler {

    /**
     * handle service call.
     * 
     * @param request
     * @return
     */
    public abstract Response handle(Request request);

    /**
     * regist service.
     * 
     * @param serviceInterface
     * @param serviceObject
     */
    public abstract <T> void regist(Class<T> serviceInterface, T serviceObject);

}