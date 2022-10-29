package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService") // Small letter
    private FortuneService fortuneService;


    public TennisCoach(){
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

    @Override
    public String getDailyWorkout() {
        return "Tennis workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
