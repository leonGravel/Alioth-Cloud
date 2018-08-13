package com.gravel.consumer.feignInterface;


import com.gravel.consumer.hystrix.IndexHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * IndexFeignClient 的demo
 * @author Gravel
 * @date 2018/8/3.
 */
@FeignClient(name="provider-coffee" , fallbackFactory= IndexHystrix.class)
public interface IndexFeignClient {

    /**
     * 这里的mapping 一定要和 provider的mapping 对应
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexStr();


}
