package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void registerNewProducts() {
        Product product = new Product();
        product.setName("Superb Java");
        product.setPrice(400);
        product.setQuantity(3);
        productRepository.save(product);
    }
}

