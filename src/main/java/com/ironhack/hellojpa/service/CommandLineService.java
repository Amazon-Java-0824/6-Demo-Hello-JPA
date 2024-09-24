package com.ironhack.hellojpa.service;


import com.ironhack.hellojpa.model.Coffee;
import com.ironhack.hellojpa.model.CoffeeEntity;
import com.ironhack.hellojpa.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Slf4j
public class CommandLineService implements CommandLineRunner {

    private final GreetService greetService;
    private final CoffeeRepository coffeeRepository;

    public CommandLineService(GreetService greetService, CoffeeRepository coffeeRepository) {
        this.greetService = greetService;
        this.coffeeRepository = coffeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        log.info("Preparing to save a coffee entity");
        var coffeeToSave = new CoffeeEntity("FlatWhite", "Australia", "Strong");
        log.info("Coffee to be saved {}", coffeeToSave);
        coffeeRepository.save(coffeeToSave);
        log.info("Coffee saved {}", coffeeToSave);

        var allCoffees = coffeeRepository.findAll();
        log.info("All coffees {}", allCoffees);

    }
}
