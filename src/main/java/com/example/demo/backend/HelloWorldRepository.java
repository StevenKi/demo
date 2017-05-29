package com.example.demo.backend;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {

    public String findWorld() {
        return "World";
    }
}
