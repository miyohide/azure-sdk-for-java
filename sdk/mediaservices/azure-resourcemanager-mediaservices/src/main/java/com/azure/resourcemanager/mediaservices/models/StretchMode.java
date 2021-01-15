// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StretchMode. */
public final class StretchMode extends ExpandableStringEnum<StretchMode> {
    /** Static value None for StretchMode. */
    public static final StretchMode NONE = fromString("None");

    /** Static value AutoSize for StretchMode. */
    public static final StretchMode AUTO_SIZE = fromString("AutoSize");

    /** Static value AutoFit for StretchMode. */
    public static final StretchMode AUTO_FIT = fromString("AutoFit");

    /**
     * Creates or finds a StretchMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StretchMode.
     */
    @JsonCreator
    public static StretchMode fromString(String name) {
        return fromString(name, StretchMode.class);
    }

    /** @return known StretchMode values. */
    public static Collection<StretchMode> values() {
        return values(StretchMode.class);
    }
}
