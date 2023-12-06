package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.conf.FacadeIT;
import com.poja.prime.repository.model.Prime;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeControllerIT extends FacadeIT {
    @Autowired
    PrimeController primeController;
    public static int CERTAINTY = 99;

    @Test
    @Order(1)
    void can_get_new_prime() {
        String probablePrimeGenerated = primeController.getNewPrime();
        BigInteger integerProbablePrimeGenerated = new BigInteger(probablePrimeGenerated);
        assertTrue(integerProbablePrimeGenerated.isProbablePrime(CERTAINTY));
    }

    @Test
    void can_get_prime_list() {
        List<Prime> primes = primeController.getGeneratedPrimes();
        int expectedPrimesLength = 1;
        assertEquals(primes.size(), expectedPrimesLength);

        for (int i = 0; i < 10; i++) {
            primeController.getNewPrime();
        }

        primes = primeController.getGeneratedPrimes();
        expectedPrimesLength = 10;
        assertEquals(primes.size(), expectedPrimesLength);
    }
}
