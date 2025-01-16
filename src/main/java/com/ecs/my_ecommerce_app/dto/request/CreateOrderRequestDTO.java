package com.ecs.my_ecommerce_app.dto.request;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOrderRequestDTO {

    @NotNull(message = "Shipping address ID is required")
    private Long shippingAddressId;

    @NotNull(message = "Billing address ID is required")
    private Long billingAddressId;

    @NotEmpty(message = "Order must contain at least one item")
    private List<OrderItemRequestDTO> items;

}
