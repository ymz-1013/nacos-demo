package com.itheima.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //声明它当前是注册中心的客户端
public class NacosWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosWebApplication.class,args);
    }
}
