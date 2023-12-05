package com.poja.prime.service;

import com.poja.prime.repository.HistoryRepository;
import com.poja.prime.repository.model.History;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HistoryService {
    private HistoryRepository historyRepository;

    public History saveHistoryIfNotCompleted(History history) {
        long currentHistoryLength = historyRepository.count();
        if (currentHistoryLength < 10) {
            return historyRepository.save(history);
        }
        return history;
    }

    public List<History> getAll() {
        return historyRepository.findAll();
    }
}
