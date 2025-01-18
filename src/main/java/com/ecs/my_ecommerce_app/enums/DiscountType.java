package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DiscountType {

    @JsonProperty("percentage")
    PERCENTAGE,

    @JsonProperty("fixed_amount")
    FIXED_AMOUNT,

    @JsonProperty("buy_x_get_y")
    BUY_X_GET_Y,

    @JsonProperty("free_shipping")
    FREE_SHIPPING;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }

}
