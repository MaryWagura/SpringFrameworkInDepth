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

    @Value("${app.name}")
    private String name;

    //go look for the profile
    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean is24;

    @Bean
    public TimeService timeService() {
        return new TimeService(is24);
    }

    @Bean
    public OutputService outputService(
            GreetingService greetingService,
            TimeService timeService) {
        return new OutputService(greetingService, timeService,name);
    }

    @Bean
    public GreetingService greetingService() {
        return new GreetingService(greeting);
    }
}
