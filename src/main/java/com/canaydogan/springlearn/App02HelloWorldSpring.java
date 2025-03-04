package com.canaydogan.springlearn;

import com.canaydogan.springlearn.game.GameRunner;
import com.canaydogan.springlearn.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Configure the things that we want to Spring to manage
        // HelloWorldConfiguration Class - @Configuration
        // name - @Bean

        // Retrieving Beans managed by Spring
        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address"));
    }
}
