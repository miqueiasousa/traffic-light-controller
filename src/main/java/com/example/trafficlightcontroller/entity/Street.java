package com.example.trafficlightcontroller.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "streets")
public class Street {
  @Id
  @GeneratedValue
  public int id;

  @Column(name = "name", unique = true)
  public String name;

  @Column(name = "city")
  public String city;

  @Column(name = "neighborhood")
  public String neighborhood;

  @OneToMany(mappedBy = "street")
  public List<Junction> junctions;

  Street() {
  }

  public Street(String name, String city, String neighborhood) {
    this.name = name;
    this.city = city;
    this.neighborhood = neighborhood;
  }
}
