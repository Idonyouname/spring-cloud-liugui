package com.liugui.springcloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: SchedualService
 * @Author: liugui
 * @Date: 2019-12-03 17:04
 **/
@FeignClient(value = "service-client")
public interface SchedualService {
    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
