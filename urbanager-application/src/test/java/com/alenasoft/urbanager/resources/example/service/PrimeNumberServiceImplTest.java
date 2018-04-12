package com.alenasoft.urbanager.resources.example.service;

import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberService;
import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberServiceImplTest {
    private PrimeNumberService primeService;

    @Before
    public void setUp() {
        this.primeService = new PrimeNumberServiceImpl();
    }

    @After
    public void tearDown() {
        this.primeService = null;
    }

    //Ex. 1

    @Test
    public void testIsPrimeNumberIfGivenNumberIsNegativeReturnFalse() {
        Boolean expectedValue = false;
        Boolean result = this.primeService.isPrimeNumber(-9);
        assertEquals(expectedValue, result);
    }

    @Test
    public void testIsPrimeNumberIfGivenNumberEqualsZeroReturnFalse() {
        Boolean expectedValue = false;
        Boolean result = this.primeService.isPrimeNumber(0);
        assertEquals(expectedValue, result);
    }

    @Test
    public void testIsPrimeNumberIfGivenNumberEqualsOneReturnFalse() {
        Boolean expectedValue = false;
        Boolean result = this.primeService.isPrimeNumber(1);
        assertEquals(expectedValue, result);
    }

    @Test
    public void testIsPrimeNumberIfGivenNumberEqualsTwoReturnFalse() {
        Boolean expectedValue = false;
        Boolean result = this.primeService.isPrimeNumber(2);
        assertEquals(expectedValue, result);
    }

    @Test
    public void testIsPrimeNumberIfGivenNumberRemaindersIsZeroWhenDividedByAnyNumberExceptOneAndItselfReturnFalse() {
        Boolean expectedValue = false;
        Boolean result = this.primeService.isPrimeNumber(9);
        assertEquals(expectedValue, result);
    }

    @Test
    public void testIsPrimeNumberIfGivenNumberIsGreaterThanIntegerMaxValueReturnFalse() {
        Boolean expectedValue = false;
        Boolean result = this.primeService.isPrimeNumber(Integer.MAX_VALUE + 1);
        assertEquals(expectedValue, result);
    }

    //Ex. 2

    @Test
    public void testGetNPrimeNumberIfNIsNegativeReturnEmptyArray() {
        String expectedValue = "[]";
        String result = this.primeService.getNPrimeNumbers(-9);
        assertEquals(expectedValue, result);
    }

}
