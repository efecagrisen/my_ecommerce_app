package com.ecs.my_ecommerce_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentType {
    @JsonProperty("credit_card")
    CREDIT_CARD,

    @JsonProperty("debit_card")
    DEBIT_CARD,

    @JsonProperty("bank_transfer")
    BANK_TRANSFER,

    @JsonProperty("paypal")
    PAYPAL,

    @JsonProperty("crypto")
    CRYPTO,

    @JsonProperty("wallet")
    WALLET,

    @JsonProperty("cod")
    COD;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }
}
