package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.Cart;
import com.ecs.my_ecommerce_app.repository.CartRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CartServiceImpl extends BaseServiceImpl<Cart, Long> {

    private final CartRepository cartRepository;


    public CartServiceImpl(CartRepository cartRepository) {
        super(cartRepository);
        this.cartRepository = cartRepository;
    }
}
