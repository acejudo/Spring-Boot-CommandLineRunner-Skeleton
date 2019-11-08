package com.acejudo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value( "${greet}" )
    private String greet;

    public String sayHello(String name){
        return String.format("%s %s", greet, name);
    }
}
