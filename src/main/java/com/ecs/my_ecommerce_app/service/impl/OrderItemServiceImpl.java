package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.OrderItem;
import com.ecs.my_ecommerce_app.repository.OrderItemRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem, Long> {

    private final OrderItemRepository orderItemRepository;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        super(orderItemRepository);
        this.orderItemRepository = orderItemRepository;
    }
}
