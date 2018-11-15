package com.lau1yach;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lyhpl
 * @Title: GateWayApplication
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/15  23:00
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class);
    }
}
