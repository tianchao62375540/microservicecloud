package com.sgg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: tianchao
 * @Date: 2019/10/20 17:26
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class,args);
    }
}
