package com.poc.portfolio.enums;

public enum BackendTech {
  JAVA("JAVA 8+"), SPRINGBOOT("Spring Boot");

  private final String value;

  BackendTech(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
