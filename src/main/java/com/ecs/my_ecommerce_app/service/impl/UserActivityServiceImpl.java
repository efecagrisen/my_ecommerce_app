package com.ecs.my_ecommerce_app.service.impl;

import com.ecs.my_ecommerce_app.entity.UserActivity;
import com.ecs.my_ecommerce_app.repository.UserActivityRepository;
import com.ecs.my_ecommerce_app.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserActivityServiceImpl extends BaseServiceImpl<UserActivity, Long> {

    private final UserActivityRepository userActivityRepository;

    public UserActivityServiceImpl(UserActivityRepository userActivityRepository) {
        super(userActivityRepository);
        this.userActivityRepository = userActivityRepository;
    }
}
