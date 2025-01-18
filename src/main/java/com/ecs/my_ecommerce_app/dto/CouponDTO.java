package com.ecs.my_ecommerce_app.dto;
import com.ecs.my_ecommerce_app.enums.CouponStatus;
import com.ecs.my_ecommerce_app.enums.DiscountType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CouponDTO extends BaseDTO{


    @JsonProperty("code")
    private String code;

    @JsonProperty("description")
    private String description;

    @JsonProperty("discount_type")
    private DiscountType discountType;

    @JsonProperty("discount_value")
    private BigDecimal discountValue;

    @JsonProperty("minimum_purchase_amount")
    private BigDecimal minimumPurchaseAmount;

    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime endDate;

    @JsonProperty("usage_limit")
    private Integer usageLimit;

    @JsonProperty("used_count")
    private Integer usedCount;

    @JsonProperty("status")
    private CouponStatus status;

}
