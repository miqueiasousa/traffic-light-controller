package com.example.trafficlightcontroller.repository;

import com.example.trafficlightcontroller.entity.Junction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JunctionRepository extends JpaRepository<Junction, Integer> {
}
