package com.ecs.my_ecommerce_app.repository;

import com.ecs.my_ecommerce_app.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
