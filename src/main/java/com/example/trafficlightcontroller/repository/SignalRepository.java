package com.example.trafficlightcontroller.repository;

import com.example.trafficlightcontroller.entity.Signal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SignalRepository extends JpaRepository<Signal, Integer> {
}
