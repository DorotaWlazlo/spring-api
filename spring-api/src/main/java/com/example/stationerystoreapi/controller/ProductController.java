package com.example.stationerystoreapi.controller;

import com.example.stationerystoreapi.model.Product;
import com.example.stationerystoreapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/types")
    public ResponseEntity<List<String>> getAllTypes() {
        List<String> types = productService.getDistinctTypes();
        return new ResponseEntity<>(types, HttpStatus.OK);
    }

    @GetMapping("/manufacturers")
    public ResponseEntity<List<String>> getAllManufacturers() {
        List<String> manufacturers = productService.getDistinctManufacturers();
        return new ResponseEntity<>(manufacturers, HttpStatus.OK);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Product>> getProductsByType(@PathVariable String type) {
        List<Product> products = productService.getProductsByType(type);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/manufacturer/{manufacturer}")
    public ResponseEntity<List<Product>> getProductsByManufacturer(@PathVariable String manufacturer) {
        List<Product> products = productService.getProductsByManufacturer(manufacturer);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
