package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.ReviewImage;
import com.ecs.my_ecommerce_app.repository.ReviewImageRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ReviewImageServiceImpl extends BaseServiceImpl<ReviewImage, Long> {

    private final ReviewImageRepository reviewImageRepository;

    public ReviewImageServiceImpl(ReviewImageRepository reviewImageRepository) {
        super(reviewImageRepository);
        this.reviewImageRepository = reviewImageRepository;
    }
}
