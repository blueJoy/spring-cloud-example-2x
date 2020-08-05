package com.bxz.example.consumeruser.feign.fallback;

import com.bxz.example.consumeruser.feign.UserFeign;
import org.springframework.stereotype.Component;

/**
 * @author baixiangzhu
 * @date 2020-08-04
 */
@Component
public class UserFeignFallBack implements UserFeign {

  @Override
  public String getUserName(String name) {
    return "fall back :" + name;
  }
}
