package com.example.entities;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductEntity {
	private int id;
	private String productName;
	private BigDecimal price;
 
	public ProductEntity() {
 
	}
 
}