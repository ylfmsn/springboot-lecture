package com.suntoon.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JDWP: Java Debug Wire Protocol, Java调试协议
 */
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        System.out.println(MyApplication.class.getClassLoader());
        SpringApplication.run(MyApplication.class, args);
    }
}
