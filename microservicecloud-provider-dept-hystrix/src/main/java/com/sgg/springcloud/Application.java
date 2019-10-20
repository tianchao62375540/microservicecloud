package com.sgg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 14:25
 * @Description:
 */
@SpringBootApplication
//@EnableEurekaClient 本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient//替代掉@EnableEurekaClient 服务发现
@EnableCircuitBreaker
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
