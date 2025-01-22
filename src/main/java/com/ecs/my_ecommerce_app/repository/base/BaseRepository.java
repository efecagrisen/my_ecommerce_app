package com.ecs.my_ecommerce_app.repository.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    Optional<T> findByIdAndIsDeletedFalse(ID id);
    Optional<T> findByIdAndIsActiveTrueAndIsDeletedFalse(ID id);

    List<T> findByIsDeletedFalse();
    List<T> findByIsActiveTrue();
    List<T> findByIsActiveTrueAndIsDeletedFalse();

    Page<T> findByIsDeletedFalse(Pageable pageable);
    Page<T> findByIsActiveTrue(Pageable pageable);
    Page<T> findByIsActiveTrueAndIsDeletedFalse(Pageable pageable);

    long countByIsActiveTrue();

    void setIsActiveFalseById(ID id);

    void setIsActiveFalseById(List<ID> ids);


}
