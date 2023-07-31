package com.example.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ProductDTO;
import com.example.entities.ProductEntity;
import com.example.mappers.ProductMapper;

@Service
public class ProductServiceImpl {
	@Autowired
	ProductMapper productMapper;
 
	public ProductDTO getProductById(int id) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(1);
		productEntity.setPrice(BigDecimal.TEN);
		productEntity.setProductName("Test Ürün");
		return productMapper.mapProductEntity2Output(productEntity);
	}
 
 
}