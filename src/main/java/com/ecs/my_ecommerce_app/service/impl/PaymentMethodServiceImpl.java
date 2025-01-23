package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.PaymentMethod;
import com.ecs.my_ecommerce_app.repository.PaymentMethodRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PaymentMethodServiceImpl extends BaseServiceImpl<PaymentMethod, Long> {

    private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodServiceImpl(PaymentMethodRepository paymentMethodRepository) {
        super(paymentMethodRepository);
        this.paymentMethodRepository = paymentMethodRepository;
    }
}
