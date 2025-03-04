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
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("number"));

        // Retrieving Beans managed by Spring
    }
}
