package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NotificationType {

    @JsonProperty("order_placed")
    ORDER_PLACED,

    @JsonProperty("order_confirmed")
    ORDER_CONFIRMED,

    @JsonProperty("order_shipped")
    ORDER_SHIPPED,

    @JsonProperty("order_delivered")
    ORDER_DELIVERED,

    @JsonProperty("payment_received")
    PAYMENT_RECEIVED,

    @JsonProperty("payment_failed")
    PAYMENT_FAILED,

    @JsonProperty("stock_alert")
    STOCK_ALERT,

    @JsonProperty("price_drop")
    PRICE_DROP,

    @JsonProperty("back_in_stock")
    BACK_IN_STOCK,

    @JsonProperty("promotion")
    PROMOTION,

    @JsonProperty("account_update")
    ACCOUNT_UPDATE,

    @JsonProperty("security_alert")
    SECURITY_ALERT;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }

}
