package com.example.trafficlightcontroller.advice.street;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.trafficlightcontroller.advice.ErrorMessage;
import com.example.trafficlightcontroller.advice.HttpStatusTitle;
import com.example.trafficlightcontroller.exception.street.StreetNameAlreadyExistsException;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class StreetNameAlreadyExistsAdvice {
  @ExceptionHandler(StreetNameAlreadyExistsException.class)
  @ResponseBody
  @ResponseStatus(HttpStatus.CONFLICT)
  ErrorMessage streetNameIsAlreadyDeclaredHandler(StreetNameAlreadyExistsException exception) {
    return new ErrorMessage(HttpStatusTitle.CONFLICT, exception.getMessage());
  }
}
