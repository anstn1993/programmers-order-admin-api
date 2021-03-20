package com.github.prgrms.orders;

import javax.validation.constraints.NotBlank;

public class ReviewRequest {

  @NotBlank(message = "content must be provided")
  private String content;

  public ReviewRequest(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }
}