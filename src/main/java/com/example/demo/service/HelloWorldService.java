package com.example.demo.service;

import com.example.demo.backend.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    public String greet() {
        String world = helloWorldRepository.findWorld();
        return "Hello, " + world + "!";
    }
}
