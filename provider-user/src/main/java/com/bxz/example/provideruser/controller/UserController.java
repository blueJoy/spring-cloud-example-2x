package com.bxz.example.provideruser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baixiangzhu
 * @date 2020-08-03
 */
@RestController
@RequestMapping("/user")
public class UserController {


  @GetMapping("/name")
  public String getUserName(String name) {
    return "hello~" + name;
  }
}
