/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Virtual Appliance Sku Properties.
 */
public class BreakOutCategoryPolicies {
    /**
     * Flag to control breakout of o365 allow category.
     */
    @JsonProperty(value = "allow")
    private Boolean allow;

    /**
     * Flag to control breakout of o365 optimize category.
     */
    @JsonProperty(value = "optimize")
    private Boolean optimize;

    /**
     * Flag to control breakout of o365 default category.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /**
     * Get flag to control breakout of o365 allow category.
     *
     * @return the allow value
     */
    public Boolean allow() {
        return this.allow;
    }

    /**
     * Set flag to control breakout of o365 allow category.
     *
     * @param allow the allow value to set
     * @return the BreakOutCategoryPolicies object itself.
     */
    public BreakOutCategoryPolicies withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Get flag to control breakout of o365 optimize category.
     *
     * @return the optimize value
     */
    public Boolean optimize() {
        return this.optimize;
    }

    /**
     * Set flag to control breakout of o365 optimize category.
     *
     * @param optimize the optimize value to set
     * @return the BreakOutCategoryPolicies object itself.
     */
    public BreakOutCategoryPolicies withOptimize(Boolean optimize) {
        this.optimize = optimize;
        return this;
    }

    /**
     * Get flag to control breakout of o365 default category.
     *
     * @return the defaultProperty value
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set flag to control breakout of o365 default category.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the BreakOutCategoryPolicies object itself.
     */
    public BreakOutCategoryPolicies withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

}
