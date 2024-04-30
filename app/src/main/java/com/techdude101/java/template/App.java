package com.techdude101.java.template;

/**
 * Main application.
 */
public class App {
  public String getGreeting() {

    return "Hello World!";
  }

  public static void main(String[] args) {

    System.out.println(new App().getGreeting());
  }
}
