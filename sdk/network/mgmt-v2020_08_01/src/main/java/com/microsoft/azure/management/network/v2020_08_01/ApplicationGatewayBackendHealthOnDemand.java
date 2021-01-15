/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.ApplicationGatewayBackendHealthOnDemandInner;

/**
 * Type representing ApplicationGatewayBackendHealthOnDemand.
 */
public interface ApplicationGatewayBackendHealthOnDemand extends HasInner<ApplicationGatewayBackendHealthOnDemandInner>, HasManager<NetworkManager> {
    /**
     * @return the backendAddressPool value.
     */
    ApplicationGatewayBackendAddressPool backendAddressPool();

    /**
     * @return the backendHealthHttpSettings value.
     */
    ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings();

}
