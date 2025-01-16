package com.ecs.my_ecommerce_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseDTO {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;
    private UserSummaryDTO createdBy;
    private UserSummaryDTO modifiedBy;

    public boolean isNew(){
        return id == null;
    }


}
