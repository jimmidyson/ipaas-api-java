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
package com.redhat.ipaas.api.v1.model;

import org.immutables.value.Value;

import java.util.List;

/**
 * Holds the result of a list, including the total count of elements. This is used by the client for working out paging
 * when viewing a large list.
 *
 * @param <T> The type of the elements in the returned list.
 */
@Value.Immutable
public interface ListResult<T> {

    /**
     *
     * @return The total count of entities available.
     */
    int getTotalCount();

    /**
     *
     * @return The filtered list of items. Depending on operations, this will contain at most getTotalCount elements.
     */
    List<T> getItems();

    class Builder<T> extends ImmutableListResult.Builder<T> {
    }

}
