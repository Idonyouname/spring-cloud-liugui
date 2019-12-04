package com.liugui.springcloudfeignhystrix.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName: SchedualServiceHystrix
 * @Author: liugui
 * @Date: 2019-12-04 15:56
 **/
@Component
public class SchedualServiceHystrix implements SchedualService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
