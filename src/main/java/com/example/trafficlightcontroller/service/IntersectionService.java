package com.example.trafficlightcontroller.service;

import java.util.List;

import com.example.trafficlightcontroller.entity.Intersection;

public interface IntersectionService {
  Intersection createIntersection(Intersection intersection);

  List<Intersection> getAllIntersections();
}
