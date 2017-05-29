package com.example.demo.service;

import com.example.demo.backend.HelloWorldRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class HelloWorldServiceTest {

    @Mock
    private HelloWorldRepository repository;

    @InjectMocks
    private HelloWorldService service;

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void testGreet() {
        // Prepare
        when(repository.findWorld()).thenReturn("world");

        // Execute
        String greeting = service.greet();

        // Verify
        assertEquals("Hello, world!", greeting);
    }


}