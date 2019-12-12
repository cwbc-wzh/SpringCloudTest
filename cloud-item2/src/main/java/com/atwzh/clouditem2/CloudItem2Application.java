package com.atwzh.clouditem2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudItem2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudItem2Application.class, args);
    }

}
