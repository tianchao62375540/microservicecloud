package com.sgg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: tianchao
 * @Date: 2019/10/20 18:42
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class,args);
    }
}
