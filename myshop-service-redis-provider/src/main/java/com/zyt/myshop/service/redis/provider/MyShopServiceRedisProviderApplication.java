package com.zyt.myshop.service.redis.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
public class MyShopServiceRedisProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run (MyShopServiceRedisProviderApplication.class, args);
        Main.main (args);
    }
}
