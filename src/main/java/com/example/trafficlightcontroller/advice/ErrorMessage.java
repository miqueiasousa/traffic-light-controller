package com.example.trafficlightcontroller.advice;

public class ErrorMessage {
  public String title;
  public String detail;

  public ErrorMessage(HttpStatusTitle title, String detail) {
    this.title = title.getTitle();
    this.detail = detail;
  }
}
