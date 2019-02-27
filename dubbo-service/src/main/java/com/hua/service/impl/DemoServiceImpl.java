package com.hua.service.impl;

import com.hua.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    public String hello() {
        return "Hello Dubbo!";
    }
}
