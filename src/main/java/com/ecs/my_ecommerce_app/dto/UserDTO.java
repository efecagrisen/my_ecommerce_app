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
public class UserDTO extends BaseDTO{

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<AddressDTO> addresses;

}
