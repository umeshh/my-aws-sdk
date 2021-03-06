/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ProjectMarshaller
 */
public class ProjectJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Project project, StructuredJsonGenerator jsonGenerator) {

        if (project == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (project.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(project.getName());
            }
            if (project.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(project.getArn());
            }
            if (project.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(project.getDescription());
            }
            if (project.getSource() != null) {
                jsonGenerator.writeFieldName("source");
                ProjectSourceJsonMarshaller.getInstance().marshall(project.getSource(), jsonGenerator);
            }
            if (project.getArtifacts() != null) {
                jsonGenerator.writeFieldName("artifacts");
                ProjectArtifactsJsonMarshaller.getInstance().marshall(project.getArtifacts(), jsonGenerator);
            }
            if (project.getEnvironment() != null) {
                jsonGenerator.writeFieldName("environment");
                ProjectEnvironmentJsonMarshaller.getInstance().marshall(project.getEnvironment(), jsonGenerator);
            }
            if (project.getServiceRole() != null) {
                jsonGenerator.writeFieldName("serviceRole").writeValue(project.getServiceRole());
            }
            if (project.getTimeoutInMinutes() != null) {
                jsonGenerator.writeFieldName("timeoutInMinutes").writeValue(project.getTimeoutInMinutes());
            }
            if (project.getEncryptionKey() != null) {
                jsonGenerator.writeFieldName("encryptionKey").writeValue(project.getEncryptionKey());
            }

            java.util.List<Tag> tagsList = project.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (project.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(project.getCreated());
            }
            if (project.getLastModified() != null) {
                jsonGenerator.writeFieldName("lastModified").writeValue(project.getLastModified());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProjectJsonMarshaller instance;

    public static ProjectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectJsonMarshaller();
        return instance;
    }

}
