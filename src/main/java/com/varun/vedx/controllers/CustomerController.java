package com.varun.vedx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.varun.vedx.model.Customer;
import com.varun.vedx.services.impl.CustomerServiceImpl;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;

    @PostMapping
    public ResponseEntity<Long> addCustomer (@RequestBody Customer customer) {
       return new ResponseEntity<>(customerServiceImpl.insert(customer),HttpStatus.OK);
    }

}
