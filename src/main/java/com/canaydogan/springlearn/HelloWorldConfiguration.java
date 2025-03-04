package com.canaydogan.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}
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
        var person = new Person("Canapocalypse", 15, new Address("Glory St.", "New York"));
        return person;
    }

    @Bean
    public Person person2MethodCall () {
        var person2 = new Person(name(), age(), address());
        return person2;
    }

    @Bean
    public Person person3Parameters (String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address () {
        var address = new Address("44250, Ballad St.", "San Francisco");
        return address;
    }
}
