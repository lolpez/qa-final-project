package com.alenasoft.urbanager.resources.example.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PrimeNumberServiceImplTest {
    private PrimeNumberServiceImpl primeService;

    @Before
    public void setUp() {
        this.primeService = new PrimeNumberServiceImpl();
    }

    @After
    public void tearDown() {
        this.primeService = null;
    }
}
