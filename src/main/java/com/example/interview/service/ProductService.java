package com.example.interview.service;

import com.example.interview.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product create(Product product);
    Product update(Long id,Product product);
    void delete(Long id);
    Product findById(Long id);
    Iterable<Product> findAll();
}
