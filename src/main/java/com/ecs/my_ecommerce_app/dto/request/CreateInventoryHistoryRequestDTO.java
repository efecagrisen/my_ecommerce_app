package com.ecs.my_ecommerce_app.dto.request;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInventoryHistoryRequestDTO {

    @NotNull
    @JsonProperty("inventory_id")
    private Long inventoryId;

    @NotNull
    @JsonProperty("quantity_changed")
    private Integer quantityChanged;

    @NotNull
    @JsonProperty("type")
    private String type;

    @JsonProperty("reference_type")
    private String reference_type;

    @JsonProperty("reference_id")
    private Long referenceId;

    @JsonProperty("notes")
    private String notes;

}
