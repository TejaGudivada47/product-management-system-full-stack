package com.production.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.model.ProductDetails;

@Repository
public interface ProductRepo extends JpaRepository<ProductDetails, Integer> {

}
