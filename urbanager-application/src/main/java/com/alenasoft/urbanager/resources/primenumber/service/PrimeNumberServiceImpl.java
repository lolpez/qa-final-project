package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberService;

import java.util.Arrays;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    /**
     * this method validataes if the input value is a prime number or not
     * returns true when is a prime number
     * returns false when is not a prime number
     * @param value
     * @return
     */
    @Override
    public Boolean isPrimeNumber(int value) {
        if (value <= 1) return false;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    /**
     * this method returns an array converted to String with the first n prime numbers
     * @param value is an int value, its purpose is to declare the length of the array
     *          if value is below than 1 then it returns an empty array
     * @return
     */
    @Override
    public String getNPrimeNumbers(int value) {
        if (value < 1) {
            return "[]";
        }else{
            int[] primesNumber = new int[value];
            int nCounter = 0;
            int nextPrimeNumber = 2;
            while (nCounter < value) {
                boolean isPrime = true;
                for (int j = 2; j < nextPrimeNumber; j++) {
                    if (!isPrimeNumber(nextPrimeNumber)) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primesNumber[nCounter] = nextPrimeNumber;
                    nCounter++;
                }
                nextPrimeNumber++;
            }
            return Arrays.toString(primesNumber);
        }
    }
}
