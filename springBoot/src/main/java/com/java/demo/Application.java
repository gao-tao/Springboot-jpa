package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GaoTao on 2017/12/17.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/greeting")
    public String greeting(){
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
