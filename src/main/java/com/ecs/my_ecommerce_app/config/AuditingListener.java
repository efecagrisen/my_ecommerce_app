package com.ecs.my_ecommerce_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class AuditingListener {

    @Bean
    public AuditorAware<String> auditorProvider(){
        // For now, returns a default value. Later, I'll get the current user from security context

        return ()-> Optional.of("SYSTEM");
    }


}
