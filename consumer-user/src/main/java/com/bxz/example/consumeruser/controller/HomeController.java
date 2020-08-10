package com.bxz.example.consumeruser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baixiangzhu
 * @date 2020-08-05
 */
@RestController
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public String hello(){
    return "consumer user";
  }

  @GetMapping("/home")
  public String home(){
    return "consumer user home";
  }

  @PostMapping("/login")
  public String login(){
    return "consumer user login success";
  }
}
