package com.lym.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyumeng on 2018/8/23.
 */
@RestController
public class TestController {
    @GetMapping("/japi/1000001")
    public String testProject(){
        return "success!";
    }
}
