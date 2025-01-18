package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CouponStatus {

    @JsonProperty("active")
    ACTIVE,

    @JsonProperty("expired")
    EXPIRED,

    @JsonProperty("used")
    USED,

    @JsonProperty("inactive")
    INACTIVE,

    @JsonProperty("scheduled")
    SCHEDULED;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }

}
