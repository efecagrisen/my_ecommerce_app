package com.ecs.my_ecommerce_app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSummaryDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("account_status")
    private String accountStatus;

    @JsonProperty("last_login")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastLogin;

    @JsonProperty("total_orders")
    private Integer totalOrders;

    @JsonProperty("membership_level")
    private String membershipLevel;

    @JsonProperty("full_name")
    public String getFullName(){
        return firstName + " " + lastName;
    }

}
