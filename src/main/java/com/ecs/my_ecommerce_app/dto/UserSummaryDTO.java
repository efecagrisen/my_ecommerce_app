package com.ecs.my_ecommerce_app.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSummaryDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public String getFullName(){
        return firstName + " " + lastName;
    }

}
