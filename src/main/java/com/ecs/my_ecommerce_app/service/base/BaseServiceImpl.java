package com.ecs.my_ecommerce_app.service.base;

import com.ecs.my_ecommerce_app.entity.BaseEntity;
import com.ecs.my_ecommerce_app.repository.base.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
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

//    public BaseServiceImpl(BaseRepository<T, ID> repository) {
//        this.repository = repository;
//    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findByIdAndIsActiveTrueAndIsDeletedFalse(id);
    }

    @Transactional
    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Transactional
    @Override
    public List<T> saveAll(List<T> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public List<T> findAll() {
        return repository.findByIsActiveTrueAndIsDeletedFalse();
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return repository.findByIsActiveTrueAndIsDeletedFalse(pageable);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @Override
    public Optional<T> findByIdAndIsDeletedFalse(ID id) {
        return repository.findByIdAndIsDeletedFalse(id);
    }

    @Override
    public Optional<T> findByIdAndIsActiveTrueAndIsDeletedFalse(ID id) {
        return repository.findByIdAndIsActiveTrueAndIsDeletedFalse(id);
    }

    @Override
    public List<T> findByIsActiveTrue() {
        return repository.findByIsActiveTrue();
    }

    @Override
    public List<T> findByIsActiveTrueAndIsDeletedFalse() {
        return repository.findByIsActiveTrueAndIsDeletedFalse();
    }

    @Override
    public Page<T> findByIsActiveTrue(Pageable pageable) {
        return repository.findByIsActiveTrue(pageable);
    }

    @Override
    public Page<T> findByIsActiveTrueAndIsDeletedFalse(Pageable pageable) {
        return repository.findByIsActiveTrueAndIsDeletedFalse(pageable);
    }

    @Transactional
    @Override
    public void softDelete(ID id) {
        //Fetch the entity
        T entity = repository.findById(id)
                .orElseThrow( () -> new EntityNotFoundException("Entity not found with ID: " + id));

        //validate entity type and state
        if( ! (entity instanceof BaseEntity baseEntity)){ //used baseEntity as pattern variable
            throw new IllegalStateException("Entity does not support soft delete");
        }

        //check if entity is deleted
        if(baseEntity.getIsDeleted()){
            throw new IllegalStateException("Entity is already deleted with ID: " + id);
        }

        baseEntity.setIsDeleted(true);

        repository.save(entity);

    }

    @Transactional
    @Override
    public void batchSoftDelete(List<ID> ids) {

        if (ids == null || ids.isEmpty()){
            throw new IllegalArgumentException("IDs list cannot be null or empty");
        }

        //Fetch all the entities
        List<T> entities = repository.findAllById(ids);

        if(entities.isEmpty()){
            throw new EntityNotFoundException("No entities found for the provided IDs");
        }

        entities.forEach(entity -> {
            if (entity instanceof BaseEntity baseEntity){

                if (baseEntity.getIsDeleted()){
                    throw new IllegalStateException("Entity is already deleted with ID: " + baseEntity.getId());
                }

                baseEntity.setIsDeleted(true);
            }else {
                throw new RuntimeException(("Entity does not support soft delete"));
            }
        });

        repository.saveAll(entities);
    }

    @Transactional
    @Override
    public void activate(ID id) {
        //Fetch the entity
        T entity = repository.findById(id)
                .orElseThrow( () -> new EntityNotFoundException("Entity not Found with ID: " + id));

        //validate entity type and state
        if( ! (entity instanceof BaseEntity baseEntity)){
            throw new IllegalStateException("Entity does not support activation/deactivation");
        }

        //check if entity is deleted
        if(baseEntity.getIsDeleted()){
            throw new IllegalStateException("Cannot activate deleted entity with ID: " + id);
        }

        //check if entity is already active
        if (baseEntity.getIsActive()){
            throw new IllegalStateException("Entity is already active with ID: " + id);
        }

        baseEntity.setIsActive(true);
        repository.save(entity);

    }

    @Transactional
    @Override
    public void deactivate(ID id) {
        //Fetch the entity
        T entity = repository.findById(id)
                .orElseThrow( () -> new EntityNotFoundException("Entity not Found with ID: " + id));

        //validate entity type and state
        if( ! (entity instanceof BaseEntity baseEntity)){
            throw new IllegalStateException("Entity does not support activation/deactivation");
        }

        //check if entity is deleted
        if(baseEntity.getIsDeleted()){
            throw new IllegalStateException("Cannot deactivate deleted entity with ID: " + id);
        }

        //check if entity is already inactive
        if (!baseEntity.getIsActive()){
            throw new IllegalStateException("Entity is already inactive with ID: " + id);
        }

        baseEntity.setIsActive(false);
        repository.save(entity);

    }

    @Transactional
    @Override
    public void batchActivate(List<ID> ids) {

        if (ids == null || ids.isEmpty()){
            throw new IllegalArgumentException("IDs list cannot be null or empty");
        }

        //Fetch all the entities
        List<T> entities = repository.findAllById(ids);
        if(entities.isEmpty()){
            throw new EntityNotFoundException("No entities found for the provided IDs");
        }

        //Check each entities' state and activate them if valid
        entities.forEach(entity -> {
            if (entity instanceof BaseEntity baseEntity){

                if (baseEntity.getIsDeleted()){
                    throw new IllegalStateException("Cannot activate deleted entity with ID: " + baseEntity.getId());
                }

                if (baseEntity.getIsActive()){
                    throw new IllegalStateException("Entity with ID " + baseEntity.getId() + " is already active");
                }

                baseEntity.setIsActive(true);
            }else {
                throw new IllegalStateException("Entity does not support activation/deactivation");
            }
        });

        repository.saveAll(entities);

    }

    @Transactional
    @Override
    public void batchDeactivate(List<ID> ids) {

        if (ids == null || ids.isEmpty()){
            throw new IllegalArgumentException("IDs list cannot be null or empty");
        }

        //Fetch all the entities
        List<T> entities = repository.findAllById(ids);
        if(entities.isEmpty()){
            throw new EntityNotFoundException("No entities found for the provided IDs");
        }

        //Check each entities' state and activate them if valid
        entities.forEach(entity -> {
            if (entity instanceof BaseEntity baseEntity){

                if (baseEntity.getIsDeleted()){
                    throw new IllegalStateException("Cannot deactivate deleted entity with ID: " + baseEntity.getId());
                }

                if (baseEntity.getIsActive()){
                    throw new IllegalStateException("Entity with ID " + baseEntity.getId() + " is already inactive");
                }

                baseEntity.setIsActive(false);
            } else {
                throw new IllegalStateException("Entity does not support activation/deactivation");
            }
        });
        repository.saveAll(entities);
    }



    @Transactional
    @Override
    public void deletePermanentlyById(ID id) {
        repository.deleteById(id);
    }

    @Transactional
    @Override
    public void deletePermanently(T entity) {
        repository.delete(entity);
    }

    @Transactional
    @Override
    public void batchDeletePermanentlyById(List<ID> ids) {
        repository.deleteAllById(ids);
    }

    @Transactional
    @Override
    public void batchDeletePermanently(List<T> entities) {
        repository.deleteAll(entities);
    }
}
