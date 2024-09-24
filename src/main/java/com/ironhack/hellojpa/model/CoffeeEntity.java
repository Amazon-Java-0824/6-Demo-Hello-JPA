package com.ironhack.hellojpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "coffees")
@Data
@NoArgsConstructor
public class CoffeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String origin;
    private String characteristics;

    public CoffeeEntity(String name, String origin, String characteristics) {
        this.name = name;
        this.origin = origin;
        this.characteristics = characteristics;
    }
}
