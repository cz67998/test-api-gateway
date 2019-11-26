package com.wangzhou.springboot_depth_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/11/25
 * Time:16:05
 * Blog:https://blog.csdn.net/qq_38522268
 **/
@Controller
public class TestController {
    @GetMapping
    @ResponseBody
    public String test(){
        return "20041";
    }
}
