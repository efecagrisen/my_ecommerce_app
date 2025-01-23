package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.Coupon;
import com.ecs.my_ecommerce_app.repository.CouponRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CouponServiceImpl extends BaseServiceImpl<Coupon, Long> {

    private final CouponRepository couponRepository;

    public CouponServiceImpl(CouponRepository couponRepository) {
        super(couponRepository);
        this.couponRepository = couponRepository;
    }
}
