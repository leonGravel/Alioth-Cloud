package com.gravel.consumer.controller;

import com.gravel.consumer.feignInterface.IndexFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IndexFeignClient indexFeignClient;


    @GetMapping("/index")
    public String index() {
        return this.indexFeignClient.getIndexStr();
//        使用ribbon进行负载均衡
//        return restTemplate.getForObject("http://provider/index", String.class);

    }

    private String getFallBackStr(){
        return "请求失败，调用熔断器！";
    }
}
