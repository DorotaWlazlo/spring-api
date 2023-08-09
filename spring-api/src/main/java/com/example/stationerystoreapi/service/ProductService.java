package com.example.stationerystoreapi.service;

import com.example.stationerystoreapi.model.Product;
import com.example.stationerystoreapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public List<Product> getProductsByType(String type) {
        return productRepository.findByType(type);
    }

    public List<Product> getProductsByManufacturer(String manufacturer) {
        return productRepository.findByManufacturer(manufacturer);
    }

    public List<String> getDistinctTypes() {
        return productRepository.findDistinctTypes();
    }

    public List<String> getDistinctManufacturers() {
        return productRepository.findDistinctManufacturers();
    }
}