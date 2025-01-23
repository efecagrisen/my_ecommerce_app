package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.InventoryHistory;
import com.ecs.my_ecommerce_app.repository.InventoryHistoryRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class InventoryHistoryServiceImpl extends BaseServiceImpl<InventoryHistory, Long> {

    private final InventoryHistoryRepository inventoryHistoryRepository;


    public InventoryHistoryServiceImpl(InventoryHistoryRepository inventoryHistoryRepository) {
        super(inventoryHistoryRepository);
        this.inventoryHistoryRepository = inventoryHistoryRepository;
    }
}
