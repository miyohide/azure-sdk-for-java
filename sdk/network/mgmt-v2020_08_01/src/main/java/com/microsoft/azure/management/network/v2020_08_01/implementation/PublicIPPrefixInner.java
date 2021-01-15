/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.ExtendedLocation;
import com.microsoft.azure.management.network.v2020_08_01.PublicIPPrefixSku;
import com.microsoft.azure.management.network.v2020_08_01.IPVersion;
import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.IpTag;
import com.microsoft.azure.management.network.v2020_08_01.ReferencedPublicIpAddress;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Public IP prefix resource.
 */
@JsonFlatten
@SkipParentValidation
public class PublicIPPrefixInner extends Resource {
    /**
     * The extended location of the public ip address.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * The public IP prefix SKU.
     */
    @JsonProperty(value = "sku")
    private PublicIPPrefixSku sku;

    /**
     * The public IP address version. Possible values include: 'IPv4', 'IPv6'.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IPVersion publicIPAddressVersion;

    /**
     * The list of tags associated with the public IP prefix.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /**
     * The Length of the Public IP Prefix.
     */
    @JsonProperty(value = "properties.prefixLength")
    private Integer prefixLength;

    /**
     * The allocated Prefix.
     */
    @JsonProperty(value = "properties.ipPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String ipPrefix;

    /**
     * The list of all referenced PublicIPAddresses.
     */
    @JsonProperty(value = "properties.publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReferencedPublicIpAddress> publicIPAddresses;

    /**
     * The reference to load balancer frontend IP configuration associated with
     * the public IP prefix.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /**
     * The customIpPrefix that this prefix is associated with.
     */
    @JsonProperty(value = "properties.customIPPrefix")
    private SubResource customIPPrefix;

    /**
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the public IP prefix resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extended location of the public ip address.
     *
     * @return the extendedLocation value
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extended location of the public ip address.
     *
     * @param extendedLocation the extendedLocation value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the public IP prefix SKU.
     *
     * @return the sku value
     */
    public PublicIPPrefixSku sku() {
        return this.sku;
    }

    /**
     * Set the public IP prefix SKU.
     *
     * @param sku the sku value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withSku(PublicIPPrefixSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the public IP address version. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the publicIPAddressVersion value
     */
    public IPVersion publicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }

    /**
     * Set the public IP address version. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param publicIPAddressVersion the publicIPAddressVersion value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.publicIPAddressVersion = publicIPAddressVersion;
        return this;
    }

    /**
     * Get the list of tags associated with the public IP prefix.
     *
     * @return the ipTags value
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the list of tags associated with the public IP prefix.
     *
     * @param ipTags the ipTags value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the Length of the Public IP Prefix.
     *
     * @return the prefixLength value
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the Length of the Public IP Prefix.
     *
     * @param prefixLength the prefixLength value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the allocated Prefix.
     *
     * @return the ipPrefix value
     */
    public String ipPrefix() {
        return this.ipPrefix;
    }

    /**
     * Get the list of all referenced PublicIPAddresses.
     *
     * @return the publicIPAddresses value
     */
    public List<ReferencedPublicIpAddress> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * Get the reference to load balancer frontend IP configuration associated with the public IP prefix.
     *
     * @return the loadBalancerFrontendIpConfiguration value
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Get the customIpPrefix that this prefix is associated with.
     *
     * @return the customIPPrefix value
     */
    public SubResource customIPPrefix() {
        return this.customIPPrefix;
    }

    /**
     * Set the customIpPrefix that this prefix is associated with.
     *
     * @param customIPPrefix the customIPPrefix value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withCustomIPPrefix(SubResource customIPPrefix) {
        this.customIPPrefix = customIPPrefix;
        return this;
    }

    /**
     * Get the resource GUID property of the public IP prefix resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the public IP prefix resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withId(String id) {
        this.id = id;
        return this;
    }

}
