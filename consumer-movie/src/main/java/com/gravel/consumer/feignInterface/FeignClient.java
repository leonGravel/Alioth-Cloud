package com.gravel.consumer.feignInterface;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FeignClient 的demo
 * @author Gravel
 * @date 2018/8/3.
 */
@org.springframework.cloud.openfeign.FeignClient(name = "provider")
public interface FeignClient {

    /**
     * 这里的mapping 一定要和 provider的mapping 对应
     * @return
     */
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String getIndexStr();
}
