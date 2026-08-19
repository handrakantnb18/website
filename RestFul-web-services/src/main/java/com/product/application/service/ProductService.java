package com.product.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.application.entity.Product;
import com.product.application.repository.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

	private final ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
}
