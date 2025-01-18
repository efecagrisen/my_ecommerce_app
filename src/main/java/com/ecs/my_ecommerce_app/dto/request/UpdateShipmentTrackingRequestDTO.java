package com.ecs.my_ecommerce_app.dto.request;
import com.ecs.my_ecommerce_app.enums.ShippingStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateShipmentTrackingRequestDTO {

    @NotNull
    @JsonProperty("status")
    private ShippingStatus status;

    @JsonProperty("tracking_number")
    private String trackingNumber;

    @JsonProperty("estimated_delivery_date")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDate estimatedDeliveryDate;

    @JsonProperty("status_update")
    private String statusUpdate;

}
