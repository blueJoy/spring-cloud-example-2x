package com.bxz.example.provideruser.controller;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baixiangzhu
 * @date 2020-08-03
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @Value("${spring.application.name}")
  private String applicationName;

  @GetMapping
  private String hello() {

    List<ServiceInstance> instances = discoveryClient.getInstances(applicationName);
    ServiceInstance serviceInstance = instances.get(new Random().nextInt(instances.size()));
    return "Hello ~" + serviceInstance.getInstanceId() + "_" + serviceInstance.getHost() + "_"
        + serviceInstance.getPort();
  }
}
