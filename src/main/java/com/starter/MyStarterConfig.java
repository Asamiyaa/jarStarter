package com.starter;

/**
 * Created by yangwenjun on 2022/12/4 11:15
 */
public class MyStarterConfig {
  private MyStarterProperties myStarterProperties;

  private String name;

  public MyStarterConfig(MyStarterProperties myStarterProperties) {
    this.myStarterProperties = myStarterProperties;
  }

  public String getName() {
    return myStarterProperties.getName();
  }

  public void setName(String name) {
    this.name = name;
  }

}
