package com.example.trafficlightcontroller.advice;

public enum HttpStatusTitle {
  BAD_REQUEST("Bad Request"),
  UNAUTHORIZED("Unauthorized"),
  FORBIDDEN("Forbidden"),
  NOT_FOUND("Not Found"),
  CONFLICT("Conflict"),
  INTERNAL_SERVER_ERROR("Internal Server Error");

  private String title;

  HttpStatusTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
