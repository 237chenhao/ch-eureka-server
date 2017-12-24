package com.ch.enreka.server.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by admin on 2017/12/24.
 */
@SpringBootApplication
@EnableEurekaServer
public class ChEurekaServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ChEurekaServerApplication.class)
                .web(true)
                .run(args);
    }
}
