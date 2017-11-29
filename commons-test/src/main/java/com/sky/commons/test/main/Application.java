package com.sky.commons.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wurenqing
 * @Description:
 * @Date 2017-11-29 17:40
 */
@SpringBootApplication(scanBasePackages = "com.sky.commons")
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
