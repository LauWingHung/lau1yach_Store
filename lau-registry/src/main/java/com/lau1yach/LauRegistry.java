package com.lau1yach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lyhpl
 * @Title: LauRegistry
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/15  22:23
 */
@EnableEurekaServer
@SpringBootApplication
public class LauRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LauRegistry.class);
    }
}
