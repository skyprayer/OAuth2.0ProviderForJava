/*
 * Copyright 2010 Yutaka Obuchi
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

// Original is OAuth Java library(http://oauth.googlecode.com/svn/code/java/)
// and modified for OAuth 2.0 Provider

// Original's copyright and license terms
/*
 * Copyright 2008 Google, Inc.
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
package net.oauth.v2;

/**
 * An exception thrown by the OAuth library.
 */
public class OAuth2Exception extends Exception {

    /**
     * For subclasses only.
     */
    protected OAuth2Exception() {
    }

    /**
     * @param message
     */
    public OAuth2Exception(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public OAuth2Exception(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public OAuth2Exception(String message, Throwable cause) {
        super(message, cause);
    }

    private static final long serialVersionUID = 1L;

}
