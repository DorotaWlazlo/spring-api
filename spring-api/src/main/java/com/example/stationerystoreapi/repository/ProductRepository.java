package com.example.stationerystoreapi.repository;

import com.example.stationerystoreapi.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByType(String type);
    List<Product> findByManufacturer(String manufacturer);

    @Query("SELECT DISTINCT p.type FROM Product p")
    List<String> findDistinctTypes();

    @Query("SELECT DISTINCT p.manufacturer FROM Product p")
    List<String> findDistinctManufacturers();
}
