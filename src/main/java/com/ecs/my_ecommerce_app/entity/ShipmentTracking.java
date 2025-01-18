package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.enums.ShippingStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shipment_tracking")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentTracking extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "order_id",nullable = false)
    @JsonManagedReference("order-shipment")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "shipping_method_id")
    @JsonManagedReference("shipping-method")
    private ShippingMethod shippingMethod;

    @JsonProperty("tracking_number")
    private String trackingNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    @JsonProperty("status")
    private ShippingStatus status;

    @Column(name = "estimated_delivery_date")
    @JsonProperty("estimated_delivery_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate estimatedDeliveryDate;

    @Column(name = "actual_delivery_date")
    @JsonProperty("actual_delivery_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate actualDeliveryDate;

    @ElementCollection
    @CollectionTable(name = "shipment_status_updates")
    @JsonProperty("status_updates")
    private List<String> statusUpdates = new ArrayList<>();


}
