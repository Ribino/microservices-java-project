package com.orders.system.order_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("param")
    public String getMethodName(@RequestParam String param) {
        return "The param is: " + param;
    }
    
}
