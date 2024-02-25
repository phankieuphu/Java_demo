package com.example.interview.service.impl;

import com.example.interview.model.Product;
import com.example.interview.repository.ProductRepository;
import com.example.interview.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        if(product.getName() == null || product.getPrice() == null) {
            return null;
        }
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product product) {
        Product productFromDb = productRepository.findById(id).orElse(null);
        if(productFromDb == null){
            return null;
        }
        productFromDb.setName(product.getName());
        productFromDb.setPrice(product.getPrice());
        return productRepository.save(productFromDb);
    }

    @Override
    public void delete(Long id) {
    productRepository.deleteById(id);

    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);

    }

    @Override
    public Iterable<Product> findAll() {
       return productRepository.findAll();
    }
}
