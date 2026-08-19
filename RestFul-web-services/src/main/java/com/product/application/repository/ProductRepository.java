package com.product.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.application.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByCategoryIgnoreCase(String category);
	
	List<Product> findNameContainingIgnoreCase(String name);
	
	boolean existByNameIgnoreCase(String name);
	
}
