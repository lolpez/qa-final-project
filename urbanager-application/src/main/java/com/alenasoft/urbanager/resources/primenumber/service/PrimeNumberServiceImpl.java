package com.alenasoft.urbanager.resources.primenumber.service;

import java.util.Arrays;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public Boolean isPrimeNumber(int value) {
        if (value <= 1) return false;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    @Override
    public String getNPrimeNumbers(int n) {
        if (n <= 0) {
            return "[]";
        }
        if (n == 1) {
            return "[2]";
        } else {
            int[] primes = new int[n];
            int ncounter = 0;
            int isPrime = 2;
            while (ncounter < n) {
                boolean prime = true;
                for (int j = 2; j < isPrime; j++) {
                    if (isPrime%j ==0){
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    primes[ncounter] = isPrime;
                    ncounter++;
                }
                isPrime++;
            }
            return Arrays.toString(primes);
        }
    }
}
