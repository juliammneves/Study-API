package com.github.juliammneves.study_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ping")
public class ControllerPing {
    @GetMapping
    public String pong(){
        return "pong";
    }
}
