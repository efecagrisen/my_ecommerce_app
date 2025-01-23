package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.CartItem;
import com.ecs.my_ecommerce_app.repository.CartItemRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CartItemServiceImpl extends BaseServiceImpl<CartItem, Long> {

    private final CartItemRepository cartItemRepository;

    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        super(cartItemRepository);
        this.cartItemRepository = cartItemRepository;
    }
}
