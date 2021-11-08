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
class constants$11 {

    static final FunctionDescriptor SSL_CTX_set_alpn_select_cb$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_set_alpn_select_cb$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_set_alpn_select_cb",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$11.SSL_CTX_set_alpn_select_cb$FUNC, false
    );
    static final FunctionDescriptor SSL_get0_alpn_selected$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_get0_alpn_selected$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_get0_alpn_selected",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$11.SSL_get0_alpn_selected$FUNC, false
    );
    static final FunctionDescriptor SSL_in_init$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SSL_in_init$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_in_init",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.SSL_in_init$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_cipher_list$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_set_cipher_list$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_set_cipher_list",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.SSL_CTX_set_cipher_list$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_new$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_new$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_new",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$11.SSL_CTX_new$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle SSL_CTX_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$11.SSL_CTX_free$FUNC, false
    );
}


