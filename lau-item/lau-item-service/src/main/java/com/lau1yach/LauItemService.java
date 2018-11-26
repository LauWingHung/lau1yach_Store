package com.lau1yach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lyhpl
 * @Title: LauItemService
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/16  9:14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lau1yach.item.mapper")
public class LauItemService {
    public static void main(String[] args) {
        SpringApplication.run(LauItemService.class);
    }
}
