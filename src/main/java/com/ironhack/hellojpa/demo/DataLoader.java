package com.ironhack.hellojpa.demo;

import com.ironhack.hellojpa.model.CoffeeEntity;
import com.ironhack.hellojpa.model.PhilosopherEntity;
import com.ironhack.hellojpa.repository.CoffeeRepository;
import com.ironhack.hellojpa.repository.PhilosopherRepository;
import com.ironhack.hellojpa.service.PhilosopherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {


//    Try to avoid using @Autowired, use constructor injection instead
    private final CoffeeRepository coffeeRepository;
    private final PhilosopherService philosopherService;

    public DataLoader(CoffeeRepository coffeeRepository, PhilosopherService philosopherService) {
        this.coffeeRepository = coffeeRepository;
        this.philosopherService = philosopherService;
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


        log.info("Preparing to populate the database with philosophers");
        var philosopher1 = new PhilosopherEntity("Plato", "Republic");
        var philosopher2 = new PhilosopherEntity("Marco Aurelio", "Stoicism");
        philosopherService.save(philosopher1);
        philosopherService.save(philosopher2);
        System.out.println(philosopherService.findAll());
        log.info("Database populated with {} philosophers", 2);


        Optional<CoffeeEntity> coffee = coffeeRepository.findById(1L);
        if (coffee.isPresent()) {
            log.info("Found coffee with id 1: {}", coffee.get());
        } else {
            log.info("Coffee with id 1 not found");
        }

        coffeeRepository.deleteById(1L);

        coffee = coffeeRepository.findById(1L);
        if (coffee.isPresent()) {
            log.info("Found coffee with id 1: {}", coffee.get());
        } else {
            log.info("Coffee with id 1 not found");
        }

    }
}
