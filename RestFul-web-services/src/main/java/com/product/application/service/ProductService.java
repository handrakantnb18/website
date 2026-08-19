package com.product.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.application.entity.Product;
import com.product.application.exception.ResourceNotFoundException;
import com.product.application.repository.ProductRepository;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

	private final ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found with id : "+id));
	}
	
	public Product createProduct(Product product) {
		if(productRepository.existByNameIgnoreCase(product.getName())) {
			throw new IllegalArgumentException("A Product with this name already exists: "+product.getName());
		}
		
		return productRepository.save(product);
	}
	
	public Product updateProduct(Long id, Product productDetails) {
		Product existing = getProductById(id);
		
		existing.setName(productDetails.getName());
		existing.setDescription(productDetails.getDescription());
		existing.setPrice(productDetails.getPrice());
		existing.setQuantity(productDetails.getQuantity());
		existing.setCategory(productDetails.getCategory());
		
		return productRepository.save(existing);
		
	}
	
	
	public void deleteProduct(Long id) {
		Product existing = getProductById(id);
		productRepository.delete(existing);
	}
	
	@Transactional(readOnly = true)
	public List<Product> getProductByCategory(String category) {
		return productRepository.findByCategoryIgnoreCase(category);
	}
	
	@Transactional(readOnly = true)
	public List<Product> searchProductByName(String name) {
		return productRepository.findByNameContainingIgnoreCase(name);
	}
}
