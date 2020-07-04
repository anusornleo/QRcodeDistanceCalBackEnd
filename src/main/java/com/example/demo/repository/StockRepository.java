package com.example.demo.repository;

import com.example.demo.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Product, Integer> {
}
