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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** swapShiftsChangeRequest. */
@Fluent
public final class MicrosoftGraphSwapShiftsChangeRequest extends MicrosoftGraphOfferShiftRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphSwapShiftsChangeRequest.class);

    /*
     * ShiftId for the recipient user with whom the request is to swap.
     */
    @JsonProperty(value = "recipientShiftId")
    private String recipientShiftId;

    /*
     * swapShiftsChangeRequest
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the recipientShiftId property: ShiftId for the recipient user with whom the request is to swap.
     *
     * @return the recipientShiftId value.
     */
    public String recipientShiftId() {
        return this.recipientShiftId;
    }

    /**
     * Set the recipientShiftId property: ShiftId for the recipient user with whom the request is to swap.
     *
     * @param recipientShiftId the recipientShiftId value to set.
     * @return the MicrosoftGraphSwapShiftsChangeRequest object itself.
     */
    public MicrosoftGraphSwapShiftsChangeRequest withRecipientShiftId(String recipientShiftId) {
        this.recipientShiftId = recipientShiftId;
        return this;
    }

    /**
     * Get the additionalProperties property: swapShiftsChangeRequest.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: swapShiftsChangeRequest.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSwapShiftsChangeRequest object itself.
     */
    public MicrosoftGraphSwapShiftsChangeRequest withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withRecipientActionDateTime(OffsetDateTime recipientActionDateTime) {
        super.withRecipientActionDateTime(recipientActionDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withRecipientActionMessage(String recipientActionMessage) {
        super.withRecipientActionMessage(recipientActionMessage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withRecipientUserId(String recipientUserId) {
        super.withRecipientUserId(recipientUserId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withSenderShiftId(String senderShiftId) {
        super.withSenderShiftId(senderShiftId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withAssignedTo(MicrosoftGraphScheduleChangeRequestActor assignedTo) {
        super.withAssignedTo(assignedTo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withManagerActionDateTime(OffsetDateTime managerActionDateTime) {
        super.withManagerActionDateTime(managerActionDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withManagerActionMessage(String managerActionMessage) {
        super.withManagerActionMessage(managerActionMessage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withManagerUserId(String managerUserId) {
        super.withManagerUserId(managerUserId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withSenderDateTime(OffsetDateTime senderDateTime) {
        super.withSenderDateTime(senderDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withSenderMessage(String senderMessage) {
        super.withSenderMessage(senderMessage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withSenderUserId(String senderUserId) {
        super.withSenderUserId(senderUserId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withState(MicrosoftGraphScheduleChangeState state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSwapShiftsChangeRequest withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
