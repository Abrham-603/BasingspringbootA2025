package com.example.basingspringboota2025.repository;

import com.example.basingspringboota2025.domain.Sboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SboardRepository extends JpaRepository<Sboard, Long> {
}












