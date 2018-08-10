package com.example.android.jokedata;

import java.util.ArrayList;
import java.util.Random;

import sun.rmi.runtime.Log;


public class JokeData {

    public String getJoke() {
        ArrayList<String> jokeList = new ArrayList<String>();

        //Jokes from http://www.laughfactory.com/jokes/family-jokes
        jokeList.add("Q: Why are hairdressers never late for work? \n" +
                "A: Because they know all the short cuts!");
        jokeList.add("I just got back from a pleasure trip. " +
                "I took my mother-in-law to the airport.");
        jokeList.add("Two antennas got married. The marriage was horrible, " +
                "but the service was great.");
        jokeList.add("Son: \"Dad, there is someone at the door to collect " +
                "donations for a community swimming pool.\" \n" +
                "Father: \"Okay, give him a glass of water.\"");

        int randomInt= new Random().nextInt(4);
        return jokeList.get(randomInt);
    }
}
