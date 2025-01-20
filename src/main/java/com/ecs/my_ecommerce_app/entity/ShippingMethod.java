package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "shipping_methods")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingMethod extends BaseEntity{

    @JsonProperty("name")
    @Column(name = "name",nullable = false)
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @JsonProperty("estimated_days")
    @Column(name = "estimated_days")
    private Integer estimatedDays;

}
