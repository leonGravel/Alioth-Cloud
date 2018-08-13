package com.gravel.consumer.hystrix;

import com.gravel.consumer.feignInterface.IndexFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Gravel
 * @date 2018/8/6.
 */

@Component
public class IndexHystrix implements FallbackFactory<IndexFeignClient> {
    @Override
    public IndexFeignClient create(Throwable cause) {
        return () -> "fuck 熔断器";
    }
}
