package com.example.demo_n_layered.service;

import com.example.demo_n_layered.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
}
