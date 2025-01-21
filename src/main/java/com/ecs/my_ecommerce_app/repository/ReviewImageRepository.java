package com.ecs.my_ecommerce_app.repository;

import com.ecs.my_ecommerce_app.entity.ReviewImage;
import com.ecs.my_ecommerce_app.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewImageRepository extends BaseRepository<ReviewImage, Long> {
}
