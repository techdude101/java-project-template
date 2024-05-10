package com.techdude101.java.template;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * App unit tests example.
 */
public class AppTest {
  /**
   * Test the app displays a greeting.
   */
  //CHECKSTYLE.OFF: AbbreviationAsWordInName
  @Test
  public void appHasAGreeting() {
    //CHECKSTYLE.ON: AbbreviationAsWordInName
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

  /**
   * Test the greeting is correct.
   */
  @Test
  public void appGreetingIsCorrect() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }
}
