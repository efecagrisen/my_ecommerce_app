package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventory_history")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryHistory extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "inventory_history",nullable = false)
    @JsonManagedReference("inventory-history")
    private Inventory inventory;

    @JsonProperty("quantity_changed")
    @Column(name = "quantity_changed")
    private Integer quantityChanged;

    @JsonProperty("type")
    @Column(name = "type",nullable = false)
    private String type;

    @JsonProperty("reference_type")
    @Column(name = "reference_type")
    private String referenceType;

    @JsonProperty("reference_id")
    @Column(name = "reference_id")
    private Long referenceId;

    @JsonProperty("notes")
    private String notes;



}
