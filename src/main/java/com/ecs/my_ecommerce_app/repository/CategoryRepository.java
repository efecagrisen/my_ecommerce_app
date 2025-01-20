package com.ecs.my_ecommerce_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecs.my_ecommerce_app.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
