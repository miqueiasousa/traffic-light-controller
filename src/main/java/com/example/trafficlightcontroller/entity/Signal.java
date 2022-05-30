package com.example.trafficlightcontroller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "signals")
public class Signal {
  @Id
  @GeneratedValue
  public int id;

  @Column(name = "state")
  public String state;

  @OneToOne
  @JoinColumn(name = "junction_id")
  public Junction junction;

  Signal() {
  }

  public Signal(String state, Junction junction) {
    this.state = state;
    this.junction = junction;
  }
}
