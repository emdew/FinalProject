package com.example.javajokelib;

import java.util.Random;

public class JavaJokeClass {

    private final String[] jokes = {
            "What's the difference between a good joke and a bad joke timing.",
            "This is also a funny joke",
            "And this one too!"
    };

    public String getJoke() {
        int index = new Random().nextInt(jokes.length);
        return jokes[index];
    }

//    public String getJoke() {
//        return "What's the difference between a good joke and a bad joke timing.";
//    }
}
