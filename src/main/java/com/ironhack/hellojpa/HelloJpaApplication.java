package com.ironhack.hellojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloJpaApplication.class, args);
    }


//    Practical Exercise: Implementing a Simple Spring Data JPA Repository
//    Task: Create a Spring Data JPA repository for managing Philosopher entities.
//            Instructions:Define a Philosopher entity class with attributes such as id, name, and school.
//    Create a PhilosopherRepository interface that extends JpaRepository<Philosopher, Long>.
//            Implement a service class that uses the PhilosopherRepository to save and retrieve Philosopher entities.
//    Test the functionality by saving and retrieving Philosopher entities from the database using the data loader example we saw in class.

}
