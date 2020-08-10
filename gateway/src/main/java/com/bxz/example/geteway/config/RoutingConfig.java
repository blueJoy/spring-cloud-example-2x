package com.bxz.example.geteway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baixiangzhu
 * @date 2020-08-05
 */
//@Configuration
public class RoutingConfig {

  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
    return routeLocatorBuilder.routes()
        .route("path_route", r -> r.path("/consumer-user")
            .uri("http://localhost:8882"))
        .build();
  }
}
