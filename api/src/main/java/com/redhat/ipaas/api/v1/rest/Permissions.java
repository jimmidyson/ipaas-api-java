/**
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.ipaas.api.v1.rest;

import com.redhat.ipaas.api.v1.model.Permission;
import io.swagger.annotations.Api;

import javax.ws.rs.Path;

@Path("/permissions")
@Api(value = "permissions")
public class Permissions extends BaseHandler implements Lister<Permission>, Getter<Permission> {

    @Override
    public Class<Permission> resourceClass() {
        return Permission.class;
    }

    @Override
    public String resourceKind() {
        return Permission.KIND;
    }

}
