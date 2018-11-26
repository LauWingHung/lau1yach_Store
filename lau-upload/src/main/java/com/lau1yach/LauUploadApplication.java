package com.lau1yach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lyhpl
 * @Title: LauUploadApplication
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/26  10:43
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LauUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(LauUploadApplication.class);
    }
}
