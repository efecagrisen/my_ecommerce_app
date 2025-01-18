package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InventoryStatus {

    @JsonProperty("in_stock")
    IN_STOCK,

    @JsonProperty("low_stock")
    LOW_STOCK,

    @JsonProperty("out_of_stock")
    OUT_OF_STOCK,

    @JsonProperty("discontinued")
    DISCONTINUED,

    @JsonProperty("incoming")
    INCOMING;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }

}
