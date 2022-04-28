package com.example.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "book")
public class Book {

    /**
     * 这是名称
     * */
    private String name;

    private String desc;

}
