package com.alenasoft.urbanager.resources.primenumber.service;

public class PrimeNumberServiceImpl implements PrimeNumberService{

    @Override
    public Boolean isPrimeNumber(int value) {
        if (value <= 1){
            return false;
        }else {
            return true;
        }
    }
}
