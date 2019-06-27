package com.likzn.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: Li jx
 * @date: 2019/6/27 16:50
 * @description:
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${hello}")
    private String hello;

    @RequestMapping("/hello")
    public String getHello() {
        return this.hello;
    }
}
