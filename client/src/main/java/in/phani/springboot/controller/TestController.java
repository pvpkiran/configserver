package in.phani.springboot.controller;


import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

  @Value("${config.server.testmessage}")
  private String message;

  @GetMapping("/hi")
  public String getProperty() {
    return message;
  }
}
