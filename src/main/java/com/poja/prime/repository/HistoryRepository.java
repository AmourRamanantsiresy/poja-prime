package com.poja.prime.repository;

import com.poja.prime.repository.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, String> {
}
