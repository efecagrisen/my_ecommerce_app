package com.ecs.my_ecommerce_app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartDTO extends BaseDTO{

    @JsonProperty("user_id")
    private Long UserId;

    @JsonProperty("cart_items")
    private List<CartItemDTO> cartItems;

    @JsonProperty("total_amount")
    private BigDecimal totalAmount;

}
