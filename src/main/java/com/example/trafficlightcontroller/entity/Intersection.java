package com.example.trafficlightcontroller.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "intersections")
public class Intersection {
  @Id
  @GeneratedValue
  public int id;

  @Column(name = "arms")
  public int arms;

  @OneToMany(mappedBy = "intersection")
  public List<Junction> junctions;

  Intersection() {
  }

  public Intersection(int arms) {
    this.arms = arms;
  }
}
