package com.atwzh.cloudeureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka2Application.class, args);
    }

}
