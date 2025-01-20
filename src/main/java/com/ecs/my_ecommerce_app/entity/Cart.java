package com.ecs.my_ecommerce_app.entity;

import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cart extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    @JsonManagedReference("user-cart")
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    @JsonManagedReference("cart-items")
    private List<CartItem> cartItems = new ArrayList<>();

    @Column(name = "total_amount")
    @JsonProperty("total_amount")
    private BigDecimal totalAmount;

}
