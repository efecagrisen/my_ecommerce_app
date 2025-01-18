package com.ecs.my_ecommerce_app.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserActivityDTO extends BaseDTO{


    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("activity_type")
    private String activityType;

    @JsonProperty("ip_address")
    private String ipAddress;

    @JsonProperty("user_agent")
    private String userAgent;

    @JsonProperty("reference_type")
    private String reference_type;

    @JsonProperty("reference_id")
    private Long referenceId;

    @JsonProperty("details")
    private String details;

    @JsonProperty("activity_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime activityDate;

}
