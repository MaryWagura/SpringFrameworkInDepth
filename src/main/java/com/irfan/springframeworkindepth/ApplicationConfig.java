package com.irfan.springframeworkindepth;

import com.irfan.springframeworkindepth.service.TimeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


public class ApplicationConfig {
    @Value("hello")
    private String greetings;

    @Bean
    public TimeService timeService() {
        return new TimeService();
    }
}
