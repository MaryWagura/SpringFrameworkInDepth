package com.irfan.springframeworkindepth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.irfan.springframeworkindepth")
@EnableAspectJAutoProxy
public class ApplicationConfig {


}
