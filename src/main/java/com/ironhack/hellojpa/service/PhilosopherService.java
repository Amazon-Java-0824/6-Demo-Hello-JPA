package com.ironhack.hellojpa.service;

import com.ironhack.hellojpa.model.PhilosopherEntity;
import com.ironhack.hellojpa.repository.PhilosopherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhilosopherService {

    private final PhilosopherRepository philosopherRepository;

    public PhilosopherService(PhilosopherRepository philosopherRepository) {
        this.philosopherRepository = philosopherRepository;
    }

    public PhilosopherEntity save(PhilosopherEntity philosopherEntity) {
        return philosopherRepository.save(philosopherEntity);
    }

    public List<PhilosopherEntity> findAll() {
        return philosopherRepository.findAll();
    }
}
