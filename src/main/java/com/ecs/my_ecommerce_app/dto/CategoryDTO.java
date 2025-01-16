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
public class CategoryDTO extends BaseDTO{

    private String name;
    private String description;
    private Long parentId;
    private List<CategoryDTO> subCategories;

}
