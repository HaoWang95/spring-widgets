package com.myspring.utilController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ServerTimeController {

    @GetMapping("/")
    public String echoServerTime(){
        return "Hello, time on the server is "+ LocalDateTime.now();
    }

    @GetMapping("/api")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }
}
