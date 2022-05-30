package com.example.trafficlightcontroller.exception.street;

public class StreetNameAlreadyExistsException extends RuntimeException {
  public StreetNameAlreadyExistsException(String name) {
    super(String.format("Street with name \"%s\" already exists", name));
  }
}
