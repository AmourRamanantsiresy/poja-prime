package com.poja.prime.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
public class ProbablePrimeService {
    public BigInteger getProbablePrime(){
        int MAX_PRIME_BIT = 10;
        int CERTAINLY = 1;
        return new BigInteger(MAX_PRIME_BIT, CERTAINLY,new Random());
    }
}
