package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.ecs.my_ecommerce_app.enums.CouponStatus;
import com.ecs.my_ecommerce_app.enums.DiscountType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "coupons")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coupon extends BaseEntity{

    @JsonProperty("code")
    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @JsonProperty("description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "discount_type",nullable = false)
    @JsonProperty("discount_type")
    private DiscountType discountType;

    @JsonProperty("discount_value")
    @Column(name = "discount_value",nullable = false)
    private BigDecimal discountValue;

    @JsonProperty("minimum_purchase_amount")
    @Column(name = "minimum_purchase_amount")
    private BigDecimal minimumPurchaseAmount;

    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH-mm-ss")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH-mm-ss")
    private LocalDateTime endDate;

    @JsonProperty("usage_limit")
    private Integer usageLimit;

    @JsonProperty("used_count")
    private Integer usedCount = 0;

    @Enumerated(EnumType.STRING)
    @JsonProperty("status")
    private CouponStatus status;


}
