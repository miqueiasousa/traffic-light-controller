package com.example.trafficlightcontroller.service;

import java.util.List;

import com.example.trafficlightcontroller.entity.Street;

public interface StreetService {
  Street createStreet(Street street);

  Street getStreetById(int id);

  List<Street> getAllStreets();
}
