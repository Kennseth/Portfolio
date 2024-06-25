package com.poc.portfolio.enums;

public enum FrontendTech {
  HTML("HTML"), CSS("CSS"),  JS("JavaScript"), TYPESCRIPT("TypeScript"), THYMELEAF("Thymeleaf");

  private final String value;

  FrontendTech(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
