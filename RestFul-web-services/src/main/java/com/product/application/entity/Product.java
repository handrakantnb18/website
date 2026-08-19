package com.product.application.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Product name is required")
	@Size(min = 2, max = 150, message = "Name must be between 2 and 150 charactors")
	@Column(nullable = false, length = 150)
	private String name;
	
	@Size(max = 1000, message = "Description can be at most 1000 charactors")
	@Column(length = 1000)
	private String description;
	
	@NotNull(message = "Price is required")
	@DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0 ")
	@Digits(integer = 10, fraction = 2, message = "Price format is invaliied")
	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal price;
	
	@NotNull(message = "Quantity is required")
	@Min(value = 0, message = "Quantity cannot be negative")
	@Column(nullable = false)
	private Integer quantity;
	
	@Size(max = 100)
	@Column(length = 100)
	private String category;
	
	@Column(name = "Created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "Updated_at")
	private LocalDateTime updatedAt;
	
	@PrePersist
	protected void onCreate() {
		createdAt = LocalDateTime.now();
		updatedAt = LocalDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate() {
		updatedAt = LocalDateTime.now();
	}
}
