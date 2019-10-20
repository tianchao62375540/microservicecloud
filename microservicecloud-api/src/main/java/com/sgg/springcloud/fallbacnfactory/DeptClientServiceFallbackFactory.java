package com.sgg.springcloud.fallbacnfactory;

import com.sgg.springcloud.entity.Dept;
import com.sgg.springcloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: tianchao
 * @Date: 2019/10/16 22:05
 * @Description:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDname("服务器关闭了");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
