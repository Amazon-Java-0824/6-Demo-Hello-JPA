package com.ironhack.hellojpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "philosophers")
@Data
@NoArgsConstructor
public class PhilosopherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String school;

    public PhilosopherEntity(String name, String school) {
        this.name = name;
        this.school = school;
    }
}
