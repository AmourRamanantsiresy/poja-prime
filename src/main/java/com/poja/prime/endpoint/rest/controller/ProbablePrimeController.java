package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.ProbablePrimeService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Value
public class ProbablePrimeController {
    private ProbablePrimeService probablePrimeService;

    @GetMapping("/new-prime")
    public String ping() {
        return probablePrimeService.getProbablePrime().toString();
    }
}
