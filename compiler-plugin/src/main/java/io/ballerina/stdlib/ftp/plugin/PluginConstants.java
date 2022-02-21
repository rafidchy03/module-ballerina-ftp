/*
 * Copyright (c) 2022 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.stdlib.ftp.plugin;

/**
 * FTP compiler plugin constants.
 */
public class PluginConstants {

    // compiler plugin constants
    public static final String PACKAGE_PREFIX = "ftp";
    public static final String ON_FILE_CHANGE_FUNC = "onFileChange";
    public static final String PACKAGE_ORG = "ballerina";

    // parameters
    public static final String WATCHEVENT = "WatchEvent";

    // return types error or nil
    public static final String ERROR = "error";

    enum CompilationErrors {
        INVALID_MULTIPLE_LISTENERS("Multiple listener attachments. Only one ftp:Listener is allowed.",
                "FTP_101"),
        INVALID_ANNOTATION_NUMBER("No annotations are allowed for ftp services.", "FTP_102"),
        TEMPLATE_CODE_GENERATION_HINT("Template generation for empty service", "FTP_103"),
        INVALID_FUNCTION("Invalid remote method.", "FTP_104"),
        NO_ON_FILE_CHANGE("onFileChange method not found.", "FTP_105"),
        MUST_HAVE_WATCHEVENT("Must have the required parameter ftp:WatchEvent.", "FTP_106"),
        ONLY_PARAMS_ALLOWED("Invalid method parameter count. Only ftp:WatchEvent is allowed.", "FTP_107"),
        INVALID_RETURN_TYPE_ERROR_OR_NIL("Invalid return type. Only error? or ftp:Error? is allowed.", "KAFKA_108");
        private final String error;
        private final String errorCode;

        CompilationErrors(String error, String errorCode) {
            this.error = error;
            this.errorCode = errorCode;
        }

        String getError() {
            return error;
        }

        String getErrorCode() {
            return errorCode;
        }
    }
}
