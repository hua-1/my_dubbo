package com.hua.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hua.controller.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class DemoController {
    @Reference
    private DemoService service;

    @RequestMapping(value = "/dubbo/demo")
    @ResponseBody
    public String hello(){
        return service.hello();
    }

}
