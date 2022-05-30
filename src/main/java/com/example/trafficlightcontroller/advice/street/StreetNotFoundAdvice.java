package com.example.trafficlightcontroller.advice.street;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.trafficlightcontroller.advice.ErrorMessage;
import com.example.trafficlightcontroller.advice.HttpStatusTitle;
import com.example.trafficlightcontroller.exception.street.StreetNotFoundException;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class StreetNotFoundAdvice {
  @ExceptionHandler(StreetNotFoundException.class)
  @ResponseBody
  @ResponseStatus(HttpStatus.NOT_FOUND)
  ErrorMessage streetNotFoundHandler(StreetNotFoundException exception) {
    return new ErrorMessage(HttpStatusTitle.NOT_FOUND, exception.getMessage());
  }
}
