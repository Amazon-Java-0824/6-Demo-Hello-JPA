package com.ironhack.hellojpa.demo;

import com.ironhack.hellojpa.model.CoffeeEntity;
import com.ironhack.hellojpa.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        log.info("Preparing to populate the database");
        var coffees = List.of(
                new CoffeeEntity("Flat White", "Australia", "Strong"),
                new CoffeeEntity("Long Black", "New Zealand", "Strong"),
                new CoffeeEntity("Latte", "Italy", "Mild"),
                new CoffeeEntity("Espresso", "Italy", "Strong"),
                new CoffeeEntity("Cappuccino", "Italy", "Mild"));
        coffeeRepository.saveAll(coffees);
        log.info("Database populated with {} coffees", coffees.size());
    }
}
