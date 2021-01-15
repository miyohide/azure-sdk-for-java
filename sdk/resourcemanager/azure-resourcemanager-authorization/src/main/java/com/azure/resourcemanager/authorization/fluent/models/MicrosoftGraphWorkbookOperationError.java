// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookOperationError. */
@Fluent
public final class MicrosoftGraphWorkbookOperationError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookOperationError.class);

    /*
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * workbookOperationError
     */
    @JsonProperty(value = "innerError")
    private MicrosoftGraphWorkbookOperationError innerError;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * workbookOperationError
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the innerError property: workbookOperationError.
     *
     * @return the innerError value.
     */
    public MicrosoftGraphWorkbookOperationError innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: workbookOperationError.
     *
     * @param innerError the innerError value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withInnerError(MicrosoftGraphWorkbookOperationError innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookOperationError.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookOperationError.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookOperationError object itself.
     */
    public MicrosoftGraphWorkbookOperationError withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerError() != null) {
            innerError().validate();
        }
    }
}
