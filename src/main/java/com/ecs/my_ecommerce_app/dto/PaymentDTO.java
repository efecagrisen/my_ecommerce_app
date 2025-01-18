package com.ecs.my_ecommerce_app.dto;
import com.ecs.my_ecommerce_app.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDTO extends BaseDTO{

    @JsonProperty("order_id")
    private Long orderId;

    @JsonProperty("payment_method")
    private Long paymentMethodId;

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("status")
    private PaymentStatus status;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("payment_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime paymentDate;


}
