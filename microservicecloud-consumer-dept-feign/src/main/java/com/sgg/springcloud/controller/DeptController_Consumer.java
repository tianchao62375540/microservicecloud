package com.sgg.springcloud.controller;

import com.sgg.springcloud.entity.Dept;
import com.sgg.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 14:57
 * @Description:
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;



    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }
}
