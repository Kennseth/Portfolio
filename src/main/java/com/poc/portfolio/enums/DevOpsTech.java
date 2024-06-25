package com.poc.portfolio.enums;

public enum DevOpsTech {
  DOCKER("Docker");

  private final String value;

  DevOpsTech(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
