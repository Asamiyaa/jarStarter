package com.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yangwenjun on 2022/12/4 11:14
 */
@ConfigurationProperties(prefix = "com.asamiya")
public class MyStarterProperties {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
