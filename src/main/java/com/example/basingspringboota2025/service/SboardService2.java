package com.example.basingspringboota2025.service;

import com.example.basingspringboota2025.domain.Sboard;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface SboardService2 {
    Map<String, Object> create(Map<String,Object> param);
    void update(Map<String,Object> param);
    void delete(int id);
    Sboard detail(int id);
    List<Sboard> list();
}
