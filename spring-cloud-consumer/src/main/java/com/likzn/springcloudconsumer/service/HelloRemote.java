package com.likzn.springcloudconsumer.service;

import com.likzn.springcloudconsumer.service.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * className HelloRemote
 * description HelloRemote
 *
 * @author Li jx
 * @version 1.0
 * @date 2019/6/26 18:41
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
