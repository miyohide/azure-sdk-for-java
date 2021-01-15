// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.resourcemanager.loganalytics.fluent.models.ManagementGroupInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ManagementGroup. */
public interface ManagementGroup {
    /**
     * Gets the serverCount property: The number of servers connected to the management group.
     *
     * @return the serverCount value.
     */
    Integer serverCount();

    /**
     * Gets the isGateway property: Gets or sets a value indicating whether the management group is a gateway.
     *
     * @return the isGateway value.
     */
    Boolean isGateway();

    /**
     * Gets the name property: The name of the management group.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the id property: The unique ID of the management group.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the created property: The datetime that the management group was created.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the dataReceived property: The last datetime that the management group received data.
     *
     * @return the dataReceived value.
     */
    OffsetDateTime dataReceived();

    /**
     * Gets the version property: The version of System Center that is managing the management group.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the sku property: The SKU of System Center that is managing the management group.
     *
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.ManagementGroupInner object.
     *
     * @return the inner object.
     */
    ManagementGroupInner innerModel();
}
