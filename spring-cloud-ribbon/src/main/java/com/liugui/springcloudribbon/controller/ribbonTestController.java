package com.liugui.springcloudribbon.controller;

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
    public String getHiService(String name){
        String url = "http://service-client/hi?name=" + name;
        return restTemplate.getForObject(url,String.class);
    }

}
