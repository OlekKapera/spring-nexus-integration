package com.aleksanderkapera.springnexusintegration;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class Controller {

    @Autowired
    private final GreetingService service;

    @GetMapping
    public String helloWorld() {
        return service.getGreeting();
    }
}
