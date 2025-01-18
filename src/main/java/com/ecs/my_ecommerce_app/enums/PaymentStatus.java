package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentStatus {
    @JsonProperty("pending")
    PENDING,

    @JsonProperty("processing")
    PROCESSING,

    @JsonProperty("completed")
    COMPLETED,

    @JsonProperty("failed")
    FAILED,

    @JsonProperty("refunded")
    REFUNDED,

    @JsonProperty("cancelled")
    CANCELLED;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }
}
