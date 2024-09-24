package com.ironhack.hellojpa.service;


import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public void greet() {
        System.out.println("Hello from Spring!");
    }

    public void greet(String name) {
        System.out.println("Hello " + name + " from Spring!");
    }

}
