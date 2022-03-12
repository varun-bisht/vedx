package com.varun.vedx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.vedx.model.Customer;
import com.varun.vedx.model.Product;
import com.varun.vedx.services.impl.CustomerServiceImpl;
import com.varun.vedx.services.impl.ProductServiceImpl;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	
	@Autowired
	ProductServiceImpl productServiceImpl;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody Product product) {
       return new ResponseEntity<>(productServiceImpl.insert(product),HttpStatus.OK);
    }
}
