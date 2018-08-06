package com.gravel.consumer.feignInterface;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * FeignClient 的demo
 * @author Gravel
 * @date 2018/8/3.
 */
public interface FeignClient {

    /**
     * 这里的mapping 一定要和 provider的mapping 对应
     * @return
     */
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String getIndexStr();

    static class HystrixClientFallback implements FeignClient {
        @Override
        public String getIndexStr() {
            return "请求失败，调用熔555断器！";
        }
    }
}
