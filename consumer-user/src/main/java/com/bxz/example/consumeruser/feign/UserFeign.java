package com.bxz.example.consumeruser.feign;

import com.bxz.example.consumeruser.feign.fallback.UserFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author baixiangzhu
 * @date 2020-08-03
 */
// 可以使用环境变量区分调用
//@FeignClient(name = "provider-user-${spring.profile.active}")
@FeignClient(name = "provider-user", fallback = UserFeignFallBack.class)
public interface UserFeign {

  // @RequestParam 必填填写
  @GetMapping("/user/name")
  String getUserName(@RequestParam(name = "name", required = false) String name);
}
