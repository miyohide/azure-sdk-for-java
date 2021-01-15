// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The object that defines the structure of an Azure Synapse error response. */
@JsonFlatten
@Fluent
public class CloudError {
    /*
     * Error code.
     */
    @JsonProperty(value = "error.code", required = true)
    private String code;

    /*
     * Error message.
     */
    @JsonProperty(value = "error.message", required = true)
    private String message;

    /*
     * Property name/path in request associated with error.
     */
    @JsonProperty(value = "error.target")
    private String target;

    /*
     * Array with additional error details.
     */
    @JsonProperty(value = "error.details")
    private List<CloudError> details;

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     *
     * @param code the code value to set.
     * @return the CloudError object itself.
     */
    public CloudError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the CloudError object itself.
     */
    public CloudError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: Property name/path in request associated with error.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Property name/path in request associated with error.
     *
     * @param target the target value to set.
     * @return the CloudError object itself.
     */
    public CloudError setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: Array with additional error details.
     *
     * @return the details value.
     */
    public List<CloudError> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Array with additional error details.
     *
     * @param details the details value to set.
     * @return the CloudError object itself.
     */
    public CloudError setDetails(List<CloudError> details) {
        this.details = details;
        return this;
    }
}
