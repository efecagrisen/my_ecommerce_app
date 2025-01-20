package com.ecs.my_ecommerce_app.dto.response;
import com.ecs.my_ecommerce_app.enums.OrderStatus;
import com.ecs.my_ecommerce_app.enums.PaymentStatus;
import com.ecs.my_ecommerce_app.enums.ShippingStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderSummary{

    @JsonProperty("order_id")
    private Long orderId;

    @JsonProperty("order_number")
    private String orderNumber;

    @JsonProperty("order_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime orderDate;

    @JsonProperty("total_amount")
    private BigDecimal totalAmount;

    @JsonProperty("order_status")
    private OrderStatus status;

    @JsonProperty("payment_status")
    private PaymentStatus paymentStatus;

    @JsonProperty("shipping_status")
    private ShippingStatus shippingStatus;

    @JsonProperty("shipping_tracking_number")
    private String shippingTrackingNumber;

    @JsonProperty("estimated_delivery_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime estimatedDeliveryDate;


}
