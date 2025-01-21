package com.ecs.my_ecommerce_app.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService <T, ID extends Serializable>{

    Optional<T> findById(ID id);

    T save(T entity);

    List<T> saveAll(List<T> entities);

    List<T> findAll();

    Page<T> findAll(Pageable pageable);

    boolean existsById(ID id);

    Optional<T> findByIdAndIsDeletedFalse(ID id);

    Optional<T> findByIdAndIsActiveTrueAndIsDeletedFalse(ID id);

    List<T> findByIsActiveTrue();

    List<T> findByIsActiveTrueAndIsDeletedFalse();

    Page <T> findByIsActiveTrue(Pageable pageable);

    Page <T> findByIsActiveTrueAndIsDeletedFalse(Pageable pageable);

    void softDelete(ID id);

    void batchSoftDelete(List<ID> ids);

    void activate(ID id);

    void deactivate(ID id);

    void batchActivate(List<ID> ids);

    void batchDeactivate(List<ID> ids);

    void deleteById(ID id);

    void delete(T entity);


}
