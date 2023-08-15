package com.production.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.production.model.ProductDetails;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public ProductDetails saveProduct(ProductDetails product) {
		
		return productRepo.save(product);
	}

	@Override
	public List<ProductDetails> getAllProduct() {
		return productRepo.findAll();
	}
	

	@Override
	public ProductDetails getProductById(Integer id) {
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		ProductDetails product = productRepo.findById(id).get();

		if (product != null) {
			productRepo.delete(product);
			return "Product Delete Sucessfully";
		}

		return "Something wrong on server";
	}

	@Override
	public ProductDetails editProduct(ProductDetails product, Integer id) {
		ProductDetails oldProduct = productRepo.findById(id).get();

		oldProduct.setProductName(product.getProductName());
		oldProduct.setDescription(product.getDescription());
		oldProduct.setPrice(product.getPrice());
		oldProduct.setStatus(product.getStatus());

		return productRepo.save(oldProduct);
	}
	
	
}

	
	



