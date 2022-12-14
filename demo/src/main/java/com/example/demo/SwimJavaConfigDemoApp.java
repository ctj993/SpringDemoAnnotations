package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());

        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }
}
