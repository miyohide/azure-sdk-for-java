// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Rotation. */
public final class Rotation extends ExpandableStringEnum<Rotation> {
    /** Static value Auto for Rotation. */
    public static final Rotation AUTO = fromString("Auto");

    /** Static value None for Rotation. */
    public static final Rotation NONE = fromString("None");

    /** Static value Rotate0 for Rotation. */
    public static final Rotation ROTATE0 = fromString("Rotate0");

    /** Static value Rotate90 for Rotation. */
    public static final Rotation ROTATE90 = fromString("Rotate90");

    /** Static value Rotate180 for Rotation. */
    public static final Rotation ROTATE180 = fromString("Rotate180");

    /** Static value Rotate270 for Rotation. */
    public static final Rotation ROTATE270 = fromString("Rotate270");

    /**
     * Creates or finds a Rotation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Rotation.
     */
    @JsonCreator
    public static Rotation fromString(String name) {
        return fromString(name, Rotation.class);
    }

    /** @return known Rotation values. */
    public static Collection<Rotation> values() {
        return values(Rotation.class);
    }
}
