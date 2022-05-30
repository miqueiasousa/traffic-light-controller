package com.example.trafficlightcontroller.repository;

import com.example.trafficlightcontroller.entity.Intersection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IntersectionRepository extends JpaRepository<Intersection, Integer> {
}
