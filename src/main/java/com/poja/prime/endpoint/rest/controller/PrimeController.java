package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.repository.model.Prime;
import com.poja.prime.service.ProbablePrimeService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Value
public class PrimeController {
    private ProbablePrimeService probablePrimeService;

    @GetMapping("/generated-primes")
    public List<Prime> getGeneratedPrimes() {
        return probablePrimeService.getTen();
    }

    @GetMapping("/new-prime")
    public String getNewPrime() {
        return probablePrimeService.getProbablePrime().toString();
    }
}
