/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_09_01.implementation;

import com.microsoft.azure.management.netapp.v2020_09_01.Snapshot;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;

class SnapshotImpl extends CreatableUpdatableImpl<Snapshot, SnapshotInner, SnapshotImpl> implements Snapshot, Snapshot.Definition, Snapshot.Update {
    private final NetAppManager manager;
    private String resourceGroupName;
    private String accountName;
    private String poolName;
    private String volumeName;
    private String snapshotName;
    private String clocation;
    private Object ubody;

    SnapshotImpl(String name, NetAppManager manager) {
        super(name, new SnapshotInner());
        this.manager = manager;
        // Set resource name
        this.snapshotName = name;
        //
    }

    SnapshotImpl(SnapshotInner inner, NetAppManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.snapshotName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "netAppAccounts");
        this.poolName = IdParsingUtils.getValueFromIdByName(inner.id(), "capacityPools");
        this.volumeName = IdParsingUtils.getValueFromIdByName(inner.id(), "volumes");
        this.snapshotName = IdParsingUtils.getValueFromIdByName(inner.id(), "snapshots");
        //
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Snapshot> createResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.createAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.snapshotName, this.clocation)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Snapshot> updateResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.snapshotName, this.ubody)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SnapshotInner> getInnerAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.getAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.snapshotName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String snapshotId() {
        return this.inner().snapshotId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SnapshotImpl withExistingVolume(String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        this.volumeName = volumeName;
        return this;
    }

    @Override
    public SnapshotImpl withLocation(String location) {
        this.clocation = location;
        return this;
    }

    @Override
    public SnapshotImpl withBody(Object body) {
        this.ubody = body;
        return this;
    }

}
