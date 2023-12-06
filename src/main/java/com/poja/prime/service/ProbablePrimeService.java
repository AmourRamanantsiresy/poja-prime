package com.poja.prime.service;

import com.poja.prime.repository.HistoryRepository;
import com.poja.prime.repository.model.History;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
@AllArgsConstructor
public class ProbablePrimeService {
    private HistoryService historyService;
    public BigInteger getProbablePrime(){
        int MAX_PRIME_BIT = 10;
        int CERTAINLY = 1;
        BigInteger generatedPrime =  new BigInteger(MAX_PRIME_BIT, CERTAINLY,new Random());
        History currentHistory = History.builder().value(generatedPrime.toString()).build();
        historyService.saveHistoryIfNotCompleted(currentHistory);
        return generatedPrime;
    }
}
