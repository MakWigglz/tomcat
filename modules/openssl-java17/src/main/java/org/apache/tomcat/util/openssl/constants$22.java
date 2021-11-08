/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$22 {

    static final FunctionDescriptor SSL_CONF_CTX_finish$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SSL_CONF_CTX_finish$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CONF_CTX_finish",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$22.SSL_CONF_CTX_finish$FUNC, false
    );
    static final FunctionDescriptor SSL_CONF_CTX_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle SSL_CONF_CTX_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CONF_CTX_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$22.SSL_CONF_CTX_free$FUNC, false
    );
    static final FunctionDescriptor SSL_CONF_CTX_set_flags$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SSL_CONF_CTX_set_flags$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CONF_CTX_set_flags",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$22.SSL_CONF_CTX_set_flags$FUNC, false
    );
    static final FunctionDescriptor SSL_CONF_CTX_set_ssl_ctx$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CONF_CTX_set_ssl_ctx$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CONF_CTX_set_ssl_ctx",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$22.SSL_CONF_CTX_set_ssl_ctx$FUNC, false
    );
    static final FunctionDescriptor SSL_CONF_cmd$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CONF_cmd$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CONF_cmd",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$22.SSL_CONF_cmd$FUNC, false
    );
    static final FunctionDescriptor SSL_CONF_cmd_value_type$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CONF_cmd_value_type$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CONF_cmd_value_type",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$22.SSL_CONF_cmd_value_type$FUNC, false
    );
}


