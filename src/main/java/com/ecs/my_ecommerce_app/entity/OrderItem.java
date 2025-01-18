package com.ecs.my_ecommerce_app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
@Getter
@Setter
@NoArgsConstructor
public class OrderItem extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id",nullable = false)
    @JsonBackReference
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",nullable = false)
    @JsonIgnoreProperties({"category","images","reviews"})
    private Product product;

    @Column(nullable = false)
    @JsonProperty("quantity")
    private Integer quantity;

    @Column(nullable = false)
    @JsonProperty("unitPrice")
    private BigDecimal unitPrice;

    @Column(nullable = false)
    @JsonProperty("subtotal")
    private BigDecimal subtotal;



}
