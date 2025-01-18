package com.ecs.my_ecommerce_app.dto;

import com.ecs.my_ecommerce_app.enums.InventoryStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("stock_quantity")
    private Integer stockQuantity;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("category_id")
    private Long categoryId;

    @JsonProperty("category_name")
    private String categoryName;

    @JsonProperty("image_urls")
    private List<String> imageUrls;

    @JsonProperty("average_rating")
    private Double averageRating;

    @JsonProperty("review_count")
    private Integer reviewCount;

    @JsonProperty("images")
    private List<ProductImageDTO> images;

    @JsonProperty("reviews")
    private List<ProductReviewDTO> reviews;

    @JsonProperty("inventory_status")
    private InventoryStatus inventoryStatus;

    @JsonProperty("promotion")
    private PromotionDTO promotion;

}
