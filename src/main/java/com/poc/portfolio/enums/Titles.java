package com.poc.portfolio.enums;

public enum Titles {
  JAVA_DEVELOPER("Java Developer");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
