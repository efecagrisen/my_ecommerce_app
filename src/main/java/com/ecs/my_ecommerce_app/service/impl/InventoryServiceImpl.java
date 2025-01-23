package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.Inventory;
import com.ecs.my_ecommerce_app.repository.InventoryRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class InventoryServiceImpl extends BaseServiceImpl<Inventory, Long> {

    private final InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        super(inventoryRepository);
        this.inventoryRepository = inventoryRepository;
    }
}
