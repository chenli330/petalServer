package com.charleymot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.charleymot.controller")
public class ServerPetalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerPetalApplication.class, args);
    }

}
