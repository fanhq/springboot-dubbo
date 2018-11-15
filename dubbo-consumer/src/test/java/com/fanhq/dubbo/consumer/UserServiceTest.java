package com.fanhq.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fanhq.dubbo.api.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hachel on 2018/11/14
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Reference
    public IUserService userService;

    @Test
    public void userSeiviceTest(){
        String result = userService.sayHello("hello");
        System.out.println(result);
    }

}