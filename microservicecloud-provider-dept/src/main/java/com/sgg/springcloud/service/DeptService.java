package com.sgg.springcloud.service;

import com.sgg.springcloud.entity.Dept;

import java.util.List;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 14:32
 * @Description:
 */
public interface DeptService {
    boolean add(Dept dept);
    Dept    get(Long id);
    List<Dept> list();
}
