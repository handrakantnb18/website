package com.allspringApis.practice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Acount {

	private String from;
	
	private String to;
	
	private BigDecimal amount;
	
	
}
