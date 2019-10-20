package com.sgg.springcloud.dao;

/**
 * @Auther: tianchao
 * @Date: 2019/10/13 14:23
 * @Description:
 */

import com.sgg.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
