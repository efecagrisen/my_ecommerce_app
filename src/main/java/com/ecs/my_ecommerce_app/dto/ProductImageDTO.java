package com.ecs.my_ecommerce_app.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductImageDTO extends BaseDTO{

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("image_url")
    private String image_type;

    @JsonProperty("is_primary")
    private Boolean isPrimary;

    @JsonProperty("sequence")
    private Integer sequence;

}
