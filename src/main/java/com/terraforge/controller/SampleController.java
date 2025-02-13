package com.terraforge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
@Slf4j
public class SampleController {
    @RequestMapping("/sample")
    public String sample() {
        log.info("SampleController.sample() called");
        return "Hello, World!";
    }
}
