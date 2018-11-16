package com.fanhq.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fanhq.dubbo.api.IUserService;

/**
 * Created by Hachel on 2018/11/14
 */

@Service(timeout = 5000)
public class UserServiceImpl implements IUserService {

    @Override
    public String sayHello(String hello) {
        System.out.println(hello);
        return "hello world";
    }
}
