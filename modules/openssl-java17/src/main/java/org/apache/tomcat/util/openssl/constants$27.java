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
class constants$27 {

    static final FunctionDescriptor OCSP_single_get0_status$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OCSP_single_get0_status$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_single_get0_status",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$27.OCSP_single_get0_status$FUNC, false
    );
    static final FunctionDescriptor OCSP_BASICRESP_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle OCSP_BASICRESP_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_BASICRESP_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$27.OCSP_BASICRESP_free$FUNC, false
    );
    static final FunctionDescriptor OCSP_RESPONSE_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle OCSP_RESPONSE_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_RESPONSE_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$27.OCSP_RESPONSE_free$FUNC, false
    );
    static final FunctionDescriptor d2i_OCSP_RESPONSE$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle d2i_OCSP_RESPONSE$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "d2i_OCSP_RESPONSE",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$27.d2i_OCSP_RESPONSE$FUNC, false
    );
    static final FunctionDescriptor OCSP_CERTID_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle OCSP_CERTID_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_CERTID_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$27.OCSP_CERTID_free$FUNC, false
    );
    static final FunctionDescriptor OCSP_REQUEST_new$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle OCSP_REQUEST_new$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_REQUEST_new",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$27.OCSP_REQUEST_new$FUNC, false
    );
}


