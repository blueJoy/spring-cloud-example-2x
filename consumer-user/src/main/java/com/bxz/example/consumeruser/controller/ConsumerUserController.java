package com.bxz.example.consumeruser.controller;

import com.bxz.example.consumeruser.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baixiangzhu
 * @date 2020-08-03
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerUserController {

  @Autowired
  private UserFeign userFeign;

  @GetMapping("/user/{name}")
  public String userName(@PathVariable String name) {
    return userFeign.getUserName(name);
  }
}
