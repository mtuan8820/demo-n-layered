package com.example.demo_n_layered.repository;

import com.example.demo_n_layered.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
