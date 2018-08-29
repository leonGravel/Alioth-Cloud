package com.gravel.consumer.controller;

import com.gravel.consumer.feignInterface.IndexFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gravel
 * @date 2018/8/3.
 */
@RestController
public class IndexController {

    @Autowired
    private IndexFeignClient indexFeignClient;


    @GetMapping("/index")
    public String index() {
//        使用ribbon进行负载均衡
        return this.indexFeignClient.getIndexStr();
    }
}
