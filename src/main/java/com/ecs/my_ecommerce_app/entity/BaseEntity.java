package com.ecs.my_ecommerce_app.entity;

import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.ecs.my_ecommerce_app.config.AuditingListener;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingListener.class)
@SoftDeletable
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id",updatable = false)
    @CreatedBy
    private User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by_id")
    @LastModifiedBy
    private User updatedBy;

    @Column(name = "is_active",nullable = false)
    private Boolean isActive = true;

    @Column(name = "is_deleted",nullable = false)
    private Boolean isDeleted = false;

    @PrePersist
    public void prePersist(){
        if (isActive == null){
            isActive = true;
        }
        if (isDeleted == null){
            isDeleted = false;
        }
    }


}
