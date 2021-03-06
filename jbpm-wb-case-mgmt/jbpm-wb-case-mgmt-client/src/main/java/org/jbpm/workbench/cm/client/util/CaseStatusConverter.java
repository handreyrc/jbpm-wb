/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.workbench.cm.client.util;

import org.jboss.errai.databinding.client.api.Converter;
import org.jbpm.workbench.cm.util.CaseStatus;

public class CaseStatusConverter implements Converter<CaseStatus, String> {

    @Override
    public CaseStatus toModelValue(final String status) {
        if (status == null || status.trim().isEmpty()) {
            return null;
        } else {
            return CaseStatus.valueOf(status);
        }
    }

    @Override
    public String toWidgetValue(final CaseStatus status) {
        if (status == null) {
            return "";
        } else {
            return status.name();
        }
    }

    @Override
    public Class<CaseStatus> getModelType() {
        return CaseStatus.class;
    }

    @Override
    public Class<String> getComponentType() {
        return String.class;
    }
}