package com.ecs.my_ecommerce_app.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_items")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartItem extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "cart_id",nullable = false)
    @JsonBackReference("cart-items")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name ="product_id",nullable = false)
    @JsonManagedReference("cartitem-product")
    private Product product;

    @Column(name = "quantity", nullable = false)
    @JsonProperty("quantity")
    private Integer quantity;

    @Column(name = "price", nullable = false)
    @JsonProperty("price")
    private BigDecimal price;


}
