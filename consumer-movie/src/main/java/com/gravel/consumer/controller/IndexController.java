package com.gravel.consumer.controller;

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
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/index")
    public String index() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider-user");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/index";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
