package com.irfan.springframeworkindepth.service;

import com.irfan.springframeworkindepth.aspect.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    @Autowired
    public GreetingService(String greeting){
        super();
    }

    @Loggable
    public String getGreeting(String name){
        return greeting + " " + name;
    }
}
