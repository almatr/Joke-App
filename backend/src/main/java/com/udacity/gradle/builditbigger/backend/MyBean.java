package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokedata.JokeData;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String getData() {
        JokeData myJoke =  new JokeData();
        return myJoke.getJoke();
    }
}