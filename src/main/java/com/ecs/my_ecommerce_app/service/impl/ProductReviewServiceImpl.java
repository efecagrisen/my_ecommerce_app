package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.ProductReview;
import com.ecs.my_ecommerce_app.repository.ProductReviewRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProductReviewServiceImpl extends BaseServiceImpl<ProductReview, Long> {

    private final ProductReviewRepository productReviewRepository;

    public ProductReviewServiceImpl(ProductReviewRepository productReviewRepository) {
        super(productReviewRepository);
        this.productReviewRepository = productReviewRepository;
    }
}
