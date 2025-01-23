package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.ShipmentTracking;
import com.ecs.my_ecommerce_app.repository.ShipmentTrackingRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ShipmentTrackingServiceImpl extends BaseServiceImpl<ShipmentTracking, Long> {

    private final ShipmentTrackingRepository shipmentTrackingRepository;

    public ShipmentTrackingServiceImpl(ShipmentTrackingRepository shipmentTrackingRepository) {
        super(shipmentTrackingRepository);
        this.shipmentTrackingRepository = shipmentTrackingRepository;
    }
}
