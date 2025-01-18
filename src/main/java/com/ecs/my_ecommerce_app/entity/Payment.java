package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false)
    @JsonManagedReference("order-payment")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "payment_method_id", nullable = false)
    @JsonManagedReference("payment-method")
    private PaymentMethod paymentMethod;

    @Column(name = "amount",nullable = false)
    @JsonProperty("amount")
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    @JsonProperty("status")
    private PaymentStatus paymentStatus;

    @Column(name = "transaction_id")
    @JsonProperty("transaction_id")
    private String transactionId;

    @Column(name = "payment_date")
    @JsonProperty("payment_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime paymentDate;


}
