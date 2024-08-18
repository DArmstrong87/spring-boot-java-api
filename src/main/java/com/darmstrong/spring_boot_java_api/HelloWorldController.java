package com.darmstrong.spring_boot_java_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String hello_world(){
        return "Hello World! Woohoo!";
    }

}
