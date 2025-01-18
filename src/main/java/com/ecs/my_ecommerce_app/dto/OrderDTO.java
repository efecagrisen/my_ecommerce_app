package com.ecs.my_ecommerce_app.dto;
import com.ecs.my_ecommerce_app.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO extends BaseDTO{

    @JsonProperty("order_number")
    private String OrderNumber;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("order_items")
    private List<OrderItemDTO> orderItems;

    @JsonProperty("total_amount")
    private BigDecimal totalAmount;

    @JsonProperty("status")
    private OrderStatus status;

    @JsonProperty("shipping_address")
    private AddressDTO shippingAddress;

    @JsonProperty("billing_address")
    private AddressDTO billingAddress;

}
