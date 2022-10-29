package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create an array of strings
    private String[] data = {"a","b","c"};

    //create a random number generator
    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        // pic a random string from the array
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
