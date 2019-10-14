package com.sgg.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 14:54
 * @Description:
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate restTemplater(){
        return new RestTemplate();
    }
}
