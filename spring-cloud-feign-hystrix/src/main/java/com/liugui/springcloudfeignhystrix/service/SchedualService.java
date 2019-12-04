package com.liugui.springcloudfeignhystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: SchedualService
 * @Author: liugui
 * @Date: 2019-12-03 17:04
 **/
// SchedualServiceHi接口的注解中加上fallback的指定类
@FeignClient(value = "service-client",fallback = SchedualServiceHystrix.class)
public interface SchedualService {
    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
