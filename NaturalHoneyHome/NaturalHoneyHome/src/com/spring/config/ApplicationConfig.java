package com.spring.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.spring.bo","com.spring.model","com.spring.service"})
//use appropriate annotation
public class ApplicationConfig
{

}
