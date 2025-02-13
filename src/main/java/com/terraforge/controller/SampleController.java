package com.terraforge.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SampleController {
    @RequestMapping("/sample")
    public String sample() {
        return "Hello, World!";
    }
}
