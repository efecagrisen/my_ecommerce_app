package com.ecs.my_ecommerce_app.entity;

import com.ecs.my_ecommerce_app.annotation.SoftDeletable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_reviews")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductReview extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",nullable = false)
    @JsonIgnoreProperties({"orders","addresses","images"})
    private Product product;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    @JsonIgnoreProperties({"orders","addresses","password"})
    private User user;

    @Column(nullable = false)
    @Min(1)
    @Max(5)
    @JsonProperty("rating")
    private Integer rating;

    @Column(length = 1000)
    @JsonProperty("comment")
    private String comment;

    @OneToMany(mappedBy = "review",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<ReviewImage> reviewImages = new HashSet<>();

    @JsonProperty("isVerifiedPurchase")
    private Boolean isVerifiedPurchase = false;


}
