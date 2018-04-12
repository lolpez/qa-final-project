package com.alenasoft.urbanager.resources.primenumber.service;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public Boolean isPrimeNumber(int value) {
        if (value <= 2) return false;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    @Override
    public String getNPrimeNumbers(int n){
        if (n<0){
            return "[]";
        }else{
            return null;
        }
    }
}
