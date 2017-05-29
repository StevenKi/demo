package com.example.demo.backend;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class HelloWorldRepositoryTest {

    @InjectMocks
    private HelloWorldRepository repository;

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void testFindWorld() {
        // Execute
        String world = repository.findWorld();

        // Verify
        assertEquals("World", world);
    }
}