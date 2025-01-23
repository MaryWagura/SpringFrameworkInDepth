package com.irfan.springframeworkindepth;

import org.springframework.beans.factory.annotation.Value;


public class ApplicationConfig {
    @Value("hello")
    private String greetings;
}
