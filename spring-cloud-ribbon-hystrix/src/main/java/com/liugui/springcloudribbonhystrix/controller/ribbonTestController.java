package com.liugui.springcloudribbonhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: ribbonTestController
 * @Author: liugui
 * @Date: 2019-12-03 16:32
 **/
@RestController
public class ribbonTestController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "hiError")
    public String getHiService(String name){
        String url = "http://service-client/hi?name=" + name;
        return restTemplate.getForObject(url,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
