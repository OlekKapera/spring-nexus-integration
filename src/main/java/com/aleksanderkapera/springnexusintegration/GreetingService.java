package com.aleksanderkapera.springnexusintegration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    public String getGreeting() {
        return "Hello World!";
    }
}
