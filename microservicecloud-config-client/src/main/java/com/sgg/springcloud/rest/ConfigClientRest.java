package com.sgg.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * micro
 * @Auther: tianchao
 * @Date: 2019/10/20 18:44
 * @Description:
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String str = "applicationName: "+applicationName+"\t eurekaServers: "+eurekaServer+" \t port: "+port;
        System.out.println("********str: " + str);
        return str;
    }
}
