package com.canaydogan.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Canaydogan";
    }

    @Bean
    public int number () {
        return 10;
    }
}
