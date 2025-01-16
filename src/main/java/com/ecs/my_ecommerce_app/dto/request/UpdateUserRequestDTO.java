package com.ecs.my_ecommerce_app.dto.request;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserRequestDTO {

    private String firstName;
    private String lastName;
    private String phone;

}
