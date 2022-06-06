package com.example.trafficlightcontroller.service;

import com.example.trafficlightcontroller.entity.Junction;

public interface JunctionService {
  public Junction createJunction(int intersectionId, int streetId);
}
