package com.production.repository;

import java.util.List;

import com.production.model.ProductDetails;

public interface Service {

	public ProductDetails saveProduct(ProductDetails product);

	public List<ProductDetails> getAllProduct();

	public ProductDetails getProductById(Integer id);

	public String deleteProduct(Integer id);

	public ProductDetails editProduct(ProductDetails product,Integer id);
}
