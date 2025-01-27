package com.irfan.springframeworkindepth;

import com.irfan.springframeworkindepth.service.GreetingService;
import com.irfan.springframeworkindepth.service.OutputService;
import com.irfan.springframeworkindepth.service.TimeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    @Value("${app.greeting}")
    private String greeting;

    @Bean
    public TimeService timeService() {
        return new TimeService(true);
    }

    @Bean
    public OutputService outputService(
            GreetingService greetingService,
            TimeService timeService) {
        return new OutputService(greetingService, timeService);
    }

    @Bean
    public GreetingService greetingService() {
        return new GreetingService(greeting);
    }
}
