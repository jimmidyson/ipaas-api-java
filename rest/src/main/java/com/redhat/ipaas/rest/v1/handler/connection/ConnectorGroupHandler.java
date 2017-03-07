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
package com.redhat.ipaas.rest.v1.handler.connection;

import javax.ws.rs.Path;

import com.redhat.ipaas.model.connection.ConnectorGroup;
import com.redhat.ipaas.rest.v1.handler.BaseHandler;
import com.redhat.ipaas.rest.v1.operations.Getter;
import com.redhat.ipaas.rest.v1.operations.Lister;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Component;

@Path("/connectorgroups")
@Api(value = "connectorgroups")
@Component
public class ConnectorGroupHandler extends BaseHandler implements Lister<ConnectorGroup>, Getter<ConnectorGroup> {

    @Override
    public Class<ConnectorGroup> resourceClass() {
        return ConnectorGroup.class;
    }

    @Override
    public String resourceKind() {
        return ConnectorGroup.KIND;
    }

}