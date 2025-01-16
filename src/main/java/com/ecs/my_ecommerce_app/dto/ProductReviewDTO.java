package com.ecs.my_ecommerce_app.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductReviewDTO extends BaseDTO{

    private Long productId;
    private Long userId;
    private String userFullName;
    private Integer rating;
    private String comment;
    private List<String> imageUrls;
    private Boolean isVerifiedPurchase;
}
