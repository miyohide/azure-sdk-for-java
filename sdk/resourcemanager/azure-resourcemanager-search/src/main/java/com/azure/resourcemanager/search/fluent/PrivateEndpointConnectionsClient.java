// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.search.models.PrivateEndpointConnectionProperties;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param properties Describes the properties of an existing Private Endpoint connection to the Azure Cognitive
     *     Search service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionInner>> updateWithResponseAsync(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        PrivateEndpointConnectionProperties properties);

    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param properties Describes the properties of an existing Private Endpoint connection to the Azure Cognitive
     *     Search service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> updateAsync(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        PrivateEndpointConnectionProperties properties);

    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> updateAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner update(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Updates a Private Endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param properties Describes the properties of an existing Private Endpoint connection to the Azure Cognitive
     *     Search service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> updateWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        PrivateEndpointConnectionProperties properties,
        Context context);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName, UUID clientRequestId);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> getAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName, UUID clientRequestId);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> getAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Gets the details of the private endpoint connection to the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the private endpoint connection to the search service in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        Context context);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionInner>> deleteWithResponseAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName, UUID clientRequestId);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> deleteAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName, UUID clientRequestId);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> deleteAsync(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner delete(
        String resourceGroupName, String searchServiceName, String privateEndpointConnectionName);

    /**
     * Disconnects the private endpoint connection and deletes it from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param privateEndpointConnectionName The name of the private endpoint connection to the Azure Cognitive Search
     *     service with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> deleteWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String privateEndpointConnectionName,
        UUID clientRequestId,
        Context context);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all private endpoint connections in the given service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateEndpointConnectionInner> listByServiceAsync(
        String resourceGroupName, String searchServiceName, UUID clientRequestId);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all private endpoint connections in the given service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateEndpointConnectionInner> listByServiceAsync(String resourceGroupName, String searchServiceName);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all private endpoint connections in the given service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByService(String resourceGroupName, String searchServiceName);

    /**
     * Gets a list of all private endpoint connections in the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all private endpoint connections in the given service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByService(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);
}
