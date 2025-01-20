package com.ecs.my_ecommerce_app.entity;
import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.ecs.my_ecommerce_app.enums.InventoryStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventories")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inventory extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "prpduct_id",nullable = false)
    @JsonManagedReference("product_inventory")
    private Product product;

    @Column(name = "quantity",nullable = false)
    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("reserved_quantity")
    @Column(name = "reserved_quantity")
    private Integer reservedQuantity = 0;

    @JsonProperty("reorder_point")
    @Column(name = "reorder_point")
    private Integer reorderPoint;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    @JsonProperty("status")
    private InventoryStatus status;


}
