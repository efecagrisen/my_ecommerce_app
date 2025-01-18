package com.ecs.my_ecommerce_app.dto;
import com.ecs.my_ecommerce_app.enums.DiscountType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionDTO extends BaseDTO{

    @JsonProperty("description")
    private String description;

    @JsonProperty("discount_type")
    private DiscountType discountType;

    @JsonProperty("discount_value")
    private BigDecimal discountValue;

    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime endDate;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("applicable_products")
    private List<Long> applicableProducts;

}
