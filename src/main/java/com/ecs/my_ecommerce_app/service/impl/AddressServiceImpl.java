package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.Address;
import com.ecs.my_ecommerce_app.repository.AddressRepository;
import com.ecs.my_ecommerce_app.repository.base.BaseRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AddressServiceImpl extends BaseServiceImpl<Address, Long> {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        super(addressRepository);
        this.addressRepository = addressRepository;
    }
}
