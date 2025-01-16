package com.ecs.my_ecommerce_app.dto;
import com.ecs.my_ecommerce_app.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
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

    private String OrderNumber;
    private Long userId;
    private List<OrderItemDTO> orderItems;
    private BigDecimal totalAmount;
    private OrderStatus status;
    private AddressDTO shippingAddress;
    private AddressDTO billingAddress;

}
