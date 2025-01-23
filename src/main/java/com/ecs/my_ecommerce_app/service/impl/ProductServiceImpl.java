package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.Product;
import com.ecs.my_ecommerce_app.repository.ProductRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }
}
