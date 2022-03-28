package com.ifi.service1.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class TestController {
    @RequestMapping("/message")
    public String sayHello(@RequestHeader("first-request") String header) {
        return "Hello from service 1 " + "" + header;
    }
}
