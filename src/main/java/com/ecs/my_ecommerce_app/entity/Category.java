package com.ecs.my_ecommerce_app.entity;

import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String name;

    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    @JsonIgnoreProperties({"subCategories","parent"})
    private Category parent;

    @OneToMany(mappedBy = "parent")
    @JsonIgnoreProperties("parent")
    private Set<Category> subcategories = new HashSet<>();

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Product> products = new HashSet<>();


}
