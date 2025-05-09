package com.fastcampus.fcboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FcBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcBoardApplication.class, args);
    }

}
