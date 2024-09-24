package com.ironhack.hellojpa.repository;

import com.ironhack.hellojpa.model.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoffeeRepository extends JpaRepository<CoffeeEntity, Long> {
}
