package com.ustglobal.integration.login.to;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequestTO {
  private String username;
  private String password;
  public String getUsername() {
  return username;
  }
  public void setUsername(String username) {
  this.username = username;
  }
  public String getPassword() {
  return password;
  }
  public void setPassword(String password) {
  this.password = password;
  }
}
