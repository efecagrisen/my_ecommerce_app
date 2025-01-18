package com.ecs.my_ecommerce_app.entity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_activities")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserActivity extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonManagedReference("user-activity")
    private User user;

    @JsonProperty("activity_type")
    @Column(name = "activity_type",nullable = false)
    private String activityType;

    @JsonProperty("ip_address")
    private String ipAddress;

    @JsonProperty("user_agent")
    private String userAgent;

    @JsonProperty("reference_type")
    private String referenceType;

    @JsonProperty("reference_id")
    private Long referenceId;

    @JsonProperty("details")
    private String details;

}
