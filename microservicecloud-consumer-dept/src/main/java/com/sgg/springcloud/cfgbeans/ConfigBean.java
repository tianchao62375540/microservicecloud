package com.sgg.springcloud.cfgbeans;

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
    public RestTemplate restTemplater(){
        return new RestTemplate();
    }
}
