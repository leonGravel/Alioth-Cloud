package com.gravel.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    DiscoveryClient discoveryClient;

    @GetMapping("/index")
    public String index() {
        String services = "get coffee macchiato Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
