package com.gravel.consumer.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gravel
 * @date 2018/8/3.
 */
@Configuration
@RibbonClient(name = "provider", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
