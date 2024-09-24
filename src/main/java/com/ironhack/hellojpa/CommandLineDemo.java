package com.ironhack.hellojpa;


import com.ironhack.hellojpa.model.Coffee;
import com.ironhack.hellojpa.service.GreetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandLineDemo implements CommandLineRunner {

    private final GreetService greetService;

    public CommandLineDemo(GreetService greetService) {
        this.greetService = greetService;
    }


    @Override
    public void run(String... args) throws Exception {
        greetService.greet();
        var scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        var name = scanner.nextLine();
        greetService.greet(name);

        var coffee = new Coffee("Café con leche de avena",
                "Spain",
                "Cozy");

        System.out.println(coffee);


    }
}
