package com.sgg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 15:56
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_App.class,args);
    }
}
