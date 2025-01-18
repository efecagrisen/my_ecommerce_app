package com.ecs.my_ecommerce_app.dto;
import com.ecs.my_ecommerce_app.enums.PaymentType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentMethodDTO extends BaseDTO{


    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("type")
    private PaymentType type;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("masked_account_number")
    private String maskedAccountNumber;

    @JsonProperty("expiry_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDate expiryDate;

    @JsonProperty("is_default")
    private Boolean isDefault;

    @JsonProperty("card_holder_name")
    private String cardHolderName;

    @JsonProperty("brand")
    private String brand; //TROY, VISA, MASTERCARD etc.

}
