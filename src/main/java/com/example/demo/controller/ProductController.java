package com.example.demo.controller;

import com.example.demo.models.Location;
import com.example.demo.models.Product;
import com.example.demo.models.Stock;
import com.example.demo.repository.ProductRepository;
import com.example.demo.services.LocationService;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    final
    ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProduct() {
        return new ResponseEntity<>(productService.retrieveCustomer(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addNewProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return product.toString();
    }

    @GetMapping("/students")
    public List<Stock> getAllStudents() {
        return productService.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public List<Stock> getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
}
