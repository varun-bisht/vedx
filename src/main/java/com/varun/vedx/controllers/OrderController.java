package com.varun.vedx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.vedx.model.Customer;
import com.varun.vedx.model.Order;
import com.varun.vedx.services.impl.CustomerServiceImpl;
import com.varun.vedx.services.impl.OrderServiceImpl;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

	
	@Autowired
	OrderServiceImpl orderServiceImpl;

    @PostMapping
    public ResponseEntity<Long> createOrder (@RequestBody Order order) {
       return new ResponseEntity<>(orderServiceImpl.insert(order),HttpStatus.OK);
    }
    

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder () {
       return new ResponseEntity<>(orderServiceImpl.getAllOrder(),HttpStatus.OK);
    }
}
