package com.canaydogan.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Canaydogan";
    }

    @Bean
    public int age () {
        return 19;
    }

    @Bean
    public Person person () {
        var person = new Person("Canapocalypse", 15);
        return person;
    }

    @Bean
    public Address address () {
        var address = new Address("44250, Ballad St.", "San Francisco");
        return address;
    }
}
