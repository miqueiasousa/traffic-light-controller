package com.example.trafficlightcontroller.service;

import java.util.List;
import java.util.Optional;

import com.example.trafficlightcontroller.entity.Street;
import com.example.trafficlightcontroller.exception.street.StreetNameAlreadyExistsException;
import com.example.trafficlightcontroller.exception.street.StreetNotFoundException;
import com.example.trafficlightcontroller.repository.StreetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StreetServiceImpl implements StreetService {
  @Autowired
  private StreetRepository streetRepository;

  public Street createStreet(Street street) {
    Optional<Street> streetWithSameName = streetRepository.findByName(street.name);

    if (streetWithSameName.isPresent()) {
      throw new StreetNameAlreadyExistsException(street.name);
    }

    return streetRepository.save(street);
  }

  public Street getStreetById(int id) {
    Optional<Street> street = streetRepository.findById(id);

    if (street.isEmpty()) {
      throw new StreetNotFoundException(id);
    }

    return street.get();
  }

  public List<Street> getAllStreets() {
    return streetRepository.findAll();
  }
}
