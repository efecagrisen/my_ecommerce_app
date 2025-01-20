package com.ecs.my_ecommerce_app.repository;

import com.ecs.my_ecommerce_app.entity.InventoryHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryHistoryRepository extends JpaRepository<InventoryHistory, Long> {
}
