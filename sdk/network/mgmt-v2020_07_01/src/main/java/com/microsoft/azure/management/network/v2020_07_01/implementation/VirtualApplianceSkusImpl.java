/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.VirtualApplianceSkus;
import com.microsoft.azure.management.network.v2020_07_01.NetworkVirtualApplianceSku;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class VirtualApplianceSkusImpl extends GroupableResourcesCoreImpl<NetworkVirtualApplianceSku, NetworkVirtualApplianceSkuImpl, NetworkVirtualApplianceSkuInner, VirtualApplianceSkusInner, NetworkManager>  implements VirtualApplianceSkus {
    protected VirtualApplianceSkusImpl(NetworkManager manager) {
        super(manager.inner().virtualApplianceSkus(), manager);
    }

    @Override
    protected Observable<NetworkVirtualApplianceSkuInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualApplianceSkusInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<NetworkVirtualApplianceSku> list() {
        VirtualApplianceSkusInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<NetworkVirtualApplianceSku> listAsync() {
        VirtualApplianceSkusInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NetworkVirtualApplianceSkuInner>, Iterable<NetworkVirtualApplianceSkuInner>>() {
            @Override
            public Iterable<NetworkVirtualApplianceSkuInner> call(Page<NetworkVirtualApplianceSkuInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkVirtualApplianceSkuInner, NetworkVirtualApplianceSku>() {
            @Override
            public NetworkVirtualApplianceSku call(NetworkVirtualApplianceSkuInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<NetworkVirtualApplianceSku> getAsync(String skuName) {
        VirtualApplianceSkusInner client = this.inner();
        return client.getAsync(skuName)
        .map(new Func1<NetworkVirtualApplianceSkuInner, NetworkVirtualApplianceSku>() {
            @Override
            public NetworkVirtualApplianceSku call(NetworkVirtualApplianceSkuInner inner) {
                return new NetworkVirtualApplianceSkuImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    protected NetworkVirtualApplianceSkuImpl wrapModel(NetworkVirtualApplianceSkuInner inner) {
        return  new NetworkVirtualApplianceSkuImpl(inner.name(), inner, manager());
    }

    @Override
    protected NetworkVirtualApplianceSkuImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
