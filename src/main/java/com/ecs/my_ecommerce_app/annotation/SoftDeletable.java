package com.ecs.my_ecommerce_app.annotation;

import org.hibernate.annotations.SQLRestriction;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@SQLRestriction("is_deleted = false")  // Changed from @Where to @SQLRestriction
public @interface SoftDeletable {

}
