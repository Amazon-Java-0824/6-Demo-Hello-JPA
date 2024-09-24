package com.ironhack.hellojpa.repository;

import com.ironhack.hellojpa.model.PhilosopherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhilosopherRepository extends JpaRepository<PhilosopherEntity, Long> {
}
