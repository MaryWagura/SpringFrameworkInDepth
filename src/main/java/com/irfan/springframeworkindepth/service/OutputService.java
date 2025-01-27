package com.irfan.springframeworkindepth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OutputService {

    private final GreetingService greetingService;
    private final TimeService timeService;
    private final String name;

    @Autowired
    public OutputService(GreetingService greetingService, TimeService timeService, String name){
        this.greetingService = greetingService;
        this.timeService = timeService;
        this.name = name;
    }

    public void generateOutput(){
        String output = timeService.getCurrentTime() + " " + greetingService.getGreeting(name);
        System.out.println(output);
    }

}
