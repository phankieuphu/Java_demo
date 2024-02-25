package com.example.interview.controller;

import com.example.interview.model.Product;
import com.example.interview.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class ProductController {
    private ProductService productService;

//    @Autowired
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,@RequestBody Product product){
        return productService.update(id,product);
    }
    @GetMapping
    public Iterable<Product> findAll()
    {
        return productService.findAll();

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id
);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }
}
