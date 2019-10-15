package com.sgg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 15:10
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.sgg.springcloud"})
public class ConsumerDept_feignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_feignApplication.class,args);
    }
}
