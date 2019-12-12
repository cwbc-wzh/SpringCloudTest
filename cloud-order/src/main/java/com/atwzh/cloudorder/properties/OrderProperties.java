package com.atwzh.cloudorder.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "myspcloud")
public class OrderProperties {

    private ItemProperties item;

}
