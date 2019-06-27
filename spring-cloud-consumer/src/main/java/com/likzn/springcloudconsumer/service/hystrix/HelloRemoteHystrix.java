package com.likzn.springcloudconsumer.service.hystrix;

import com.likzn.springcloudconsumer.service.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @auther: Li jx
 * @date: 2019/6/27 15:45
 * @description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello " + name + ",this message send failed";
    }
}
