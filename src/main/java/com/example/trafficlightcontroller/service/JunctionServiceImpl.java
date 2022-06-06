package com.example.trafficlightcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trafficlightcontroller.entity.Intersection;
import com.example.trafficlightcontroller.entity.Junction;
import com.example.trafficlightcontroller.entity.Street;
import com.example.trafficlightcontroller.repository.IntersectionRepository;
import com.example.trafficlightcontroller.repository.JunctionRepository;
import com.example.trafficlightcontroller.repository.StreetRepository;

@Service
public class JunctionServiceImpl implements JunctionService {
  @Autowired
  private JunctionRepository junctionRepository;

  @Autowired
  private IntersectionRepository intersectionRepository;

  @Autowired
  private StreetRepository streetRepository;

  public Junction createJunction(int intersectionId, int streetId) {
    Intersection intersection = intersectionRepository.findById(intersectionId).get();
    Street street = streetRepository.findById(streetId).get();

    Junction junction = new Junction(intersection, street);

    junctionRepository.save(junction);

    return junction;
  };
}
