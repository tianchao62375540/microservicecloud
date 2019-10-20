package com.sgg.springcloud.service;

import com.sgg.springcloud.entity.Dept;
import com.sgg.springcloud.fallbacnfactory.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: tianchao
 * @Date: 2019/10/15 22:07
 * @Description:
 */

//@FeignClient(value = "microservicecloud-provider-dept")
@FeignClient(value = "microservicecloud-provider-dept-hystrix",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);
}
