package com.techdude101.java.template;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * App unit tests example.
 */
public class AppTest {
  //CHECKSTYLE.OFF: AbbreviationAsWordInName
  @Test
  public void appHasAGreeting() {
    //CHECKSTYLE.ON: AbbreviationAsWordInName
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }
}
