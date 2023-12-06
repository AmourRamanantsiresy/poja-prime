package com.poja.prime.service;

import com.poja.prime.repository.PrimeRepository;
import com.poja.prime.repository.model.Prime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class ProbablePrimeService {
    private PrimeRepository primeRepository;

    public Prime saveHistoryIfNotCompleted(Prime prime) {
        long currentHistoryLength = primeRepository.count();
        if (currentHistoryLength < 10) {
            return primeRepository.save(prime);
        }
        return prime;
    }

    public List<Prime> getTen() {
        return primeRepository.findAll();
    }
    public BigInteger getProbablePrime(){
        int MAX_PRIME_BIT = 10;
        int CERTAINLY = 99;
        BigInteger generatedPrime =  new BigInteger(MAX_PRIME_BIT, CERTAINLY,new Random());
        Prime currentPrime = Prime.builder().value(generatedPrime.toString()).build();
        saveHistoryIfNotCompleted(currentPrime);
        return generatedPrime;
    }
}
