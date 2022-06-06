package com.example.trafficlightcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trafficlightcontroller.entity.Intersection;
import com.example.trafficlightcontroller.service.IntersectionService;

@RestController
public class IntersectionController {
  @Autowired
  private IntersectionService intersectionService;

  @GetMapping("/intersections")
  public List<Intersection> getAllIntersections() {
    return intersectionService.getAllIntersections();
  }

  @PostMapping("/intersections")
  public Intersection createIntersection(@RequestBody Intersection data) {
    return intersectionService.createIntersection(data);
  }
}
