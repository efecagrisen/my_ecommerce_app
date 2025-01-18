package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ShippingStatus {

    @JsonProperty("pending")
    PENDING,

    @JsonProperty("processing")
    PROCESSING,

    @JsonProperty("picked_up")
    PICKED_UP,

    @JsonProperty("in_transit")
    IN_TRANSIT,

    @JsonProperty("out_for_delivery")
    OUT_FOR_DELIVERY,

    @JsonProperty("delivered")
    DELIVERED,

    @JsonProperty("failed")
    FAILED,

    @JsonProperty("returned")
    RETURNED;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }
}
