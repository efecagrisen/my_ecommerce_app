package com.ecs.my_ecommerce_app.dto.request;
import com.ecs.my_ecommerce_app.enums.PaymentType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePaymentMethodRequestDTO {

    @NotNull
    @JsonProperty("type")
    private PaymentType type;


    @NotNull
    @JsonProperty("provider")
    private String provider;

    @NotNull
    @JsonProperty("account_number")
    private String accountNumber;

    @NotNull
    @JsonProperty("expiry_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDate expiryDate;

    @NotNull
    @JsonProperty("is_default")
    private Boolean isDefault;


}
