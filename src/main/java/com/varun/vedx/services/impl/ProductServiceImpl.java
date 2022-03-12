package com.varun.vedx.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.vedx.model.Customer;
import com.varun.vedx.model.Product;
import com.varun.vedx.repositories.ProductRepository;
import com.varun.vedx.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;

	@Override
	public Long insert(Product product) {
		// TODO Auto-generated method stub
		Product savedProductDetail = productRepository.save(product);
		Long productId= savedProductDetail.getId();
        return productId;
	}
	
	
}
