package com.liugui.springcloudfeignhystrix.controller;

import com.liugui.springcloudfeignhystrix.service.SchedualService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: HelloFeignController
 * @Author: liugui
 * @Date: 2019-12-03 17:06
 **/
@RestController
public class HelloFeignController {

    @Resource
    private SchedualService schedualService;

    @RequestMapping("/sayHi")
    public String sayHi(String name){
        return schedualService.sayHiFromClientOne(name);
    }

}
