package com.example.demo.services;

import com.example.demo.models.Product;
import com.example.demo.models.Stock;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    final private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> retrieveCustomer() {
        return (List<Product>) productRepository.findAll();
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public List<Stock> getAllStudents() {
        List<Stock> studentDtos = new ArrayList<>();
        List<Product> products = (List<Product>) productRepository.findAll();
        products.forEach(student -> {
            Stock studentDto = mapEntityToDto(student);
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }
    private Stock mapEntityToDto(Product product) {
        Stock stock = new Stock();
        stock.setId(product.getId());
        stock.setLocations(product.getLocations());
        return stock;
    }

    public List<Stock> getProductById(int id) {
        List<Stock> stocks = new ArrayList<>();
        List<Product> students = (List<Product>) productRepository.findAllById(Collections.singleton(id));
        students.forEach(student -> {
            System.out.println("zzz"+student);
            Stock studentDto = mapEntityToDto(student);
            stocks.add(studentDto);
        });
        return stocks;
    }

    public List<Stock> getProductByIdWithLatLon(int id) {
        List<Stock> stocks = new ArrayList<>();
        List<Product> students = (List<Product>) productRepository.findAllById(Collections.singleton(id));
        students.forEach(student -> {
            Stock stock = mapEntityToDto(student);
            stocks.add(stock);
        });
        return stocks;
    }

}
