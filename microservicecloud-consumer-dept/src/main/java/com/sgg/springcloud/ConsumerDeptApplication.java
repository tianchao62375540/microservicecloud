package com.sgg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 15:10
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerDeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptApplication.class,args);
    }
}
