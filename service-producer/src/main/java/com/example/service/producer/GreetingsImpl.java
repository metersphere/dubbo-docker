package com.example.service.producer;

import com.example.service.Greetings;
import com.example.service.User;

/**
 * Created by libin on 9/19/16.
 */
public class GreetingsImpl implements Greetings {
    public String say(String name) {
        return "Greetings from " + name;
    }

    public String hello(User user) {
        return "Name: "+user.name+", Age: "+user.age+", Gender: "+user.gender;
    }
}
