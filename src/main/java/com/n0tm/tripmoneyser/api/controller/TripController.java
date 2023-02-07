package com.n0tm.tripmoneyser.api.controller;

import com.n0tm.tripmoneyser.api.response.TestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/trip")
public class TripController {
    @GetMapping
    public TestResponse getById() {
        return new TestResponse(System.getenv("PROJECT_ROOT"));
    }
}
