package com.ecs.my_ecommerce_app.dto;

import com.ecs.my_ecommerce_app.dto.response.UserSummaryDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("created_at")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime updatedAt;

    @JsonProperty("is_active")
    private Boolean isActive;

    @JsonProperty("created_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserSummaryDTO createdBy;

    @JsonProperty("modified_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserSummaryDTO modifiedBy;
    @JsonProperty("is_new")
    public boolean isNew(){
        return id == null;
    }


}
