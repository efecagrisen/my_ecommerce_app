package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.ProductImage;
import com.ecs.my_ecommerce_app.repository.ProductImageRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProductImageServiceImpl extends BaseServiceImpl<ProductImage, Long> {

    private final ProductImageRepository productImageRepository;

    public ProductImageServiceImpl(ProductImageRepository productImageRepository) {
        super(productImageRepository);
        this.productImageRepository = productImageRepository;
    }
}
