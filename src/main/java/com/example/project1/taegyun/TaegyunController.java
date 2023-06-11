package com.example.project1.taegyun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaegyunController {

    @Autowired
    private TaegyunService taegyunService;

    @GetMapping("/")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("/taegyun")
    public Object test2() {
        return taegyunService.transformData();
    }

}
