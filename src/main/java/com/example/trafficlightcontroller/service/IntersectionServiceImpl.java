package com.example.trafficlightcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trafficlightcontroller.entity.Intersection;
import com.example.trafficlightcontroller.repository.IntersectionRepository;

@Service
public class IntersectionServiceImpl implements IntersectionService {
  @Autowired
  private IntersectionRepository intersectionRepository;

  public Intersection createIntersection(Intersection intersection) {
    return intersectionRepository.save(intersection);
  }

  public List<Intersection> getAllIntersections() {
    return intersectionRepository.findAll();
  }
}
