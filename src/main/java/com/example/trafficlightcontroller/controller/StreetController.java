package com.example.trafficlightcontroller.controller;

import java.util.List;

import com.example.trafficlightcontroller.entity.Street;
import com.example.trafficlightcontroller.service.StreetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreetController {
  @Autowired
  private StreetService streetService;

  @GetMapping("/streets")
  public List<Street> getAllStreets() {
    return streetService.getAllStreets();
  }

  @PostMapping("/streets")
  public Street createStreet(@RequestBody Street data) {
    return streetService.createStreet(data);
  }

  @GetMapping("/streets/{id}")
  public Street getStreet(@PathVariable int id) {
    return streetService.getStreetById(id);
  }
}
