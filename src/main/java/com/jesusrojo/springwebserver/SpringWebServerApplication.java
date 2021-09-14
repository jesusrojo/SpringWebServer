package com.jesusrojo.springwebserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringWebServerApplication {

    public static void main(String[] args) {
        System.out.println("##### SpringWebServerApplication main START #####");

        SpringApplication.run(SpringWebServerApplication.class, args);

        System.out.println("##### SpringWebServerApplication main END #####");
    }
}