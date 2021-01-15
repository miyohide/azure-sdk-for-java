/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.implementation.LoadBalancerNetworkInterfacesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LoadBalancerNetworkInterfaces.
 */
public interface LoadBalancerNetworkInterfaces extends HasInner<LoadBalancerNetworkInterfacesInner> {
    /**
     * Gets associated load balancer network interfaces.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LoadBalancerNetworkInterface> listAsync(final String resourceGroupName, final String loadBalancerName);

}
