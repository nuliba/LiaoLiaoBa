package com.hwj.tieba.feign;

import com.hwj.tieba.feign.fallback.UserServiceFallback;
import com.hwj.tieba.resp.ServerResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserServiceFallback.class)
@Component
public interface UserService {
    @RequestMapping(value = "/increaseAccountExp", method = RequestMethod.POST)
    ServerResponse increaseAccountExp(@RequestParam("increaseExp") Integer increaseExp, @RequestParam("token") String token,@RequestParam("userId") String userId);
}