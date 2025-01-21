package com.ecs.my_ecommerce_app.service.base;

import com.ecs.my_ecommerce_app.repository.base.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public abstract class BaseServiceImpl <T, ID extends Serializable> implements BaseService<T,ID> {

    protected final BaseRepository<T, ID> repository;

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public List<T> saveAll(List<T> entities) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public boolean existsById(ID id) {
        return false;
    }

    @Override
    public Optional<T> findByIdAndIsDeletedFalse(ID id) {
        return Optional.empty();
    }

    @Override
    public Optional<T> findByIdAndIsActiveTrueAndIsDeletedFalse(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findByIsActiveTrue() {
        return null;
    }

    @Override
    public List<T> findByIsActiveTrueAndIsDeletedFalse() {
        return null;
    }

    @Override
    public Page<T> findByIsActiveTrue(Pageable pageable) {
        return null;
    }

    @Override
    public Page<T> findByIsActiveTrueAndIsDeletedFalse(Pageable pageable) {
        return null;
    }

    @Override
    public void softDelete(ID id) {

    }

    @Override
    public void batchSoftDelete(List<ID> ids) {

    }

    @Override
    public void activate(ID id) {

    }

    @Override
    public void deactivate(ID id) {

    }

    @Override
    public void batchActivate(List<ID> ids) {

    }

    @Override
    public void batchDeactivate(List<ID> ids) {

    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public void delete(T entity) {

    }
}
