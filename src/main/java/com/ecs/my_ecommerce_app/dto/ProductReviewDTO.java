package com.ecs.my_ecommerce_app.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductReviewDTO extends BaseDTO{

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("user_full_name")
    private String userFullName;

    @JsonProperty("rating")
    private Integer rating;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("image_urls")
    private List<String> imageUrls;

    @JsonProperty("is_verified_purchase")
    private Boolean isVerifiedPurchase;

    @JsonProperty("images")
    private List<ReviewImageDTO> images;

}
