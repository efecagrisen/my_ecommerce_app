package com.ecs.my_ecommerce_app.repository;

import com.ecs.my_ecommerce_app.entity.Inventory;
import com.ecs.my_ecommerce_app.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends BaseRepository<Inventory, Long> {
}
