package com.myspring.widgets.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class LocalTimeRestController {

    @GetMapping("/")
    public String echoTime(){
        return "Hello, now is "+ LocalDateTime.now();
    }
}
