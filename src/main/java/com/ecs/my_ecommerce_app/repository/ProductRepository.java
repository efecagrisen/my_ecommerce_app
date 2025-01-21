package com.ecs.my_ecommerce_app.repository;

import com.ecs.my_ecommerce_app.entity.Product;
import com.ecs.my_ecommerce_app.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {
}
