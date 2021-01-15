// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphLocationUniqueIdType. */
public final class MicrosoftGraphLocationUniqueIdType extends ExpandableStringEnum<MicrosoftGraphLocationUniqueIdType> {
    /** Static value unknown for MicrosoftGraphLocationUniqueIdType. */
    public static final MicrosoftGraphLocationUniqueIdType UNKNOWN = fromString("unknown");

    /** Static value locationStore for MicrosoftGraphLocationUniqueIdType. */
    public static final MicrosoftGraphLocationUniqueIdType LOCATION_STORE = fromString("locationStore");

    /** Static value directory for MicrosoftGraphLocationUniqueIdType. */
    public static final MicrosoftGraphLocationUniqueIdType DIRECTORY = fromString("directory");

    /** Static value private for MicrosoftGraphLocationUniqueIdType. */
    public static final MicrosoftGraphLocationUniqueIdType PRIVATE = fromString("private");

    /** Static value bing for MicrosoftGraphLocationUniqueIdType. */
    public static final MicrosoftGraphLocationUniqueIdType BING = fromString("bing");

    /**
     * Creates or finds a MicrosoftGraphLocationUniqueIdType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphLocationUniqueIdType.
     */
    @JsonCreator
    public static MicrosoftGraphLocationUniqueIdType fromString(String name) {
        return fromString(name, MicrosoftGraphLocationUniqueIdType.class);
    }

    /** @return known MicrosoftGraphLocationUniqueIdType values. */
    public static Collection<MicrosoftGraphLocationUniqueIdType> values() {
        return values(MicrosoftGraphLocationUniqueIdType.class);
    }
}
