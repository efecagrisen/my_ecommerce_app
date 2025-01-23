package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.ShippingMethod;
import com.ecs.my_ecommerce_app.repository.ShippingMethodRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ShippingMethodServiceImpl extends BaseServiceImpl<ShippingMethod, Long> {

    private final ShippingMethodRepository shippingMethodRepository;

    public ShippingMethodServiceImpl(ShippingMethodRepository shippingMethodRepository) {
        super(shippingMethodRepository);
        this.shippingMethodRepository = shippingMethodRepository;
    }
}
