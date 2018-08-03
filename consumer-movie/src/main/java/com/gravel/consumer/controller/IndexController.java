package com.gravel.consumer.controller;

import com.gravel.consumer.feignInterface.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Gravel
 * @date 2018/8/3.
 */
@RestController
public class IndexController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private FeignClient feignClient;
    @GetMapping("/index")
    public String index() {
        return this.feignClient.getIndexStr();
//        使用ribbon进行负载均衡
//        return restTemplate.getForObject("http://provider/index", String.class);

    }
}
