package com.ironhack.hellojpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Coffee {
    private String name;
    private String origin;
    private String characteristics;
}
