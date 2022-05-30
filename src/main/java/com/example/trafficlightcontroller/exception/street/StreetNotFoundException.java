package com.example.trafficlightcontroller.exception.street;

public class StreetNotFoundException extends RuntimeException {
  public StreetNotFoundException(int id) {
    super(String.format("Street with id %d not found", id));
  }
}
