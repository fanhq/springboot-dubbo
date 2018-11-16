package com.fanhq.dubbo.provider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hachel on 2018/11/14
 */

@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-demo");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig localRegistry() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfig.setClient("curator");
        registryConfig.setProtocol("dubbo");
        //registryConfig.setId("localRegistry"); 这里设置id不起作用，可以通过方法的名字区分注册中心
        return registryConfig;
    }
}
