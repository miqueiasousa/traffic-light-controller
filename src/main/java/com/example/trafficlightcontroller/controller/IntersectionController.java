package com.example.trafficlightcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trafficlightcontroller.entity.Intersection;
import com.example.trafficlightcontroller.entity.Junction;
import com.example.trafficlightcontroller.service.IntersectionService;
import com.example.trafficlightcontroller.service.JunctionService;

@RestController
public class IntersectionController {
  @Autowired
  private IntersectionService intersectionService;

  @Autowired
  private JunctionService junctionService;

  @GetMapping("/intersections")
  public List<Intersection> getAllIntersections() {
    return intersectionService.getAllIntersections();
  }

  @PostMapping("/intersections")
  public Intersection createIntersection(@RequestBody Intersection data) {
    return intersectionService.createIntersection(data);
  }

  @PostMapping("/intersections/{intersectionId}/junctions")
  public Junction createJunction(@PathVariable int intersectionId) {
    return junctionService.createJunction(intersectionId, 3);
  }
}
