package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService") // Small letter
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside default constructor setFortuneService");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside default constructor doSomeCrazyStuff");
//        this.fortuneService = fortuneService;
//    }

    // init method
    @PostConstruct
    public void startup(){
        System.out.println("Startup");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
