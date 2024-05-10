package com.techdude101.java.template;

/**
 * Main application.
 */
public class App {
  /**
   * Get a greeting.
   *
   * @return greeting as a string.
   */
  public String getGreeting() {

    return "Hello World!";
  }

  /**
   * Main - application entry point.
   *
   * @param args command line arguments.
   */
  public static void main(final String[] args) {

    System.out.println(new App().getGreeting());
  }
}
