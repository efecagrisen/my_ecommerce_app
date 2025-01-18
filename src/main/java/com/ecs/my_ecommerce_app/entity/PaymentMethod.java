package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.enums.PaymentType;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "payment_methods")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentMethod extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonManagedReference("user-payment-method")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "type",nullable = false)
    @JsonProperty("type")
    private PaymentType type;

    @JsonProperty("provider")
    private String provider;

    @Column(name = "account_number")
    @JsonProperty("account_number")
    @JsonIgnore
    private String accountNumber;

    @Column(name = "expiry_date")
    @JsonProperty("expiry_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate expiryDate;

    @Column(name = "is_default")
    @JsonProperty("is_default")
    private Boolean isDefault = false;


}
