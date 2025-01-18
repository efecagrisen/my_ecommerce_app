package com.ecs.my_ecommerce_app.helper;

import com.ecs.my_ecommerce_app.enums.InventoryStatus;
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
public class ProductInventoryStatus {

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("available_quantity")
    private Integer availableQuantity;

    @JsonProperty("reserved_quantity")
    private Integer reservedQuantity;

    @JsonProperty("reorder_point")
    private Integer reorderPoint;

    @JsonProperty("status")
    private InventoryStatus status;

    @JsonProperty("last_updated")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime lastUpdated;



}
