package com.example.trafficlightcontroller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "junctions")
public class Junction {
  @Id
  @GeneratedValue
  public int id;

  @ManyToOne
  @JoinColumn(name = "intersection_id")
  public Intersection intersection;

  @ManyToOne
  @JoinColumn(name = "street_id")
  public Street street;

  @OneToOne(mappedBy = "junction")
  public Signal signal;

  Junction() {
  }

  public Junction(Intersection intersection, Street street) {
    this.intersection = intersection;
    this.street = street;
  }
}
