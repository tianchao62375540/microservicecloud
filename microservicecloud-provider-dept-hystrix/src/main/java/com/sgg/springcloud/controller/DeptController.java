package com.sgg.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sgg.springcloud.entity.Dept;
import com.sgg.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 14:36
 * @Description:
 */
@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);
        if(null == dept){
            throw new RuntimeException("该ID: "+id+ "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(Long id){
        return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in mysql");
    }
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        //盘点Eureka里面的微服务名字
        List<String> list = discoveryClient.getServices();
        log.info("[**************"+list+"]");
        List<ServiceInstance> instances = discoveryClient.getInstances("microservicecloud-provider-dept");
        for(ServiceInstance instance:instances){
            log.info("[**********"+instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri()+"]");
        }
        return this.discoveryClient;
    }
}
