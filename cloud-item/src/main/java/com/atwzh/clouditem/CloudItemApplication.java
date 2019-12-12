package com.atwzh.clouditem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudItemApplication.class, args);
    }

}
