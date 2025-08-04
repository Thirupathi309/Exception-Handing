package com.user.defined.Exceptions;

//Custom Exception class extending RuntimeException
public class NoDataFoundException extends RuntimeException {

 // Constructor with custom message
 public NoDataFoundException(String msg) {
     super(msg);
 }
}
