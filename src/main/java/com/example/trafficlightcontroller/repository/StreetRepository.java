package com.example.trafficlightcontroller.repository;

import java.util.Optional;

import com.example.trafficlightcontroller.entity.Street;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, Integer> {
  Optional<Street> findByName(String name);
}
