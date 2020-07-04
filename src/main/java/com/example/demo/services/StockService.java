package com.example.demo.services;

import com.example.demo.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

public class StockService {
    final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void getStockById(int id){
        stockRepository.findAllById(Collections.singleton(id));
    }
}
