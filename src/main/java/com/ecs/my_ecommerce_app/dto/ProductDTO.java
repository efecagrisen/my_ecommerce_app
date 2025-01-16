package com.ecs.my_ecommerce_app.dto;

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
public class ProductDTO extends BaseDTO{

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private String sku;
    private Long categoryId;
    private String categoryName;
    private List<String> imageUrls;
    private Double averageRating;
    private Integer reviewCount;

}
