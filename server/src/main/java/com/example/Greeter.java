package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @return someone is the name
   * @param greeting string 
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }

  /**
   * @return someoneGuest is the name
   * @param greeting string 
   */
  public final String greetGuest(final String someoneGuest) {
    return String.format("Hello , %s!", someoneGuest);
  }
}
