package com.example.jsptest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.jsptest")
public class JspTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JspTestApplication.class, args);
    }

}
