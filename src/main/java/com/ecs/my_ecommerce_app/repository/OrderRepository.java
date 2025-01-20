package com.ecs.my_ecommerce_app.repository;

import com.ecs.my_ecommerce_app.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
