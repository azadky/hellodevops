package com.azadkaya.hellodevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {

        return "Hello World From Project " + LocalDate.now();
    }


    @GetMapping("/info")
    public String info() {
        return "Hello World project running";
    }
}
