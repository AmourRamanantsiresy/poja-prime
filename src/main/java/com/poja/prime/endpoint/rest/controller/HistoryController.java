package com.poja.prime.endpoint.rest.controller;


import com.poja.prime.repository.model.History;
import com.poja.prime.service.HistoryService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Value
public class HistoryController {
    private final HistoryService historyService;

    @GetMapping("/generated-primes")
    public List<History> getHistory() {
        return historyService.getAll();
    }
}
