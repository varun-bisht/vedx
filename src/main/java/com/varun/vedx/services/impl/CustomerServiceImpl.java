package com.varun.vedx.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.vedx.model.Customer;
import com.varun.vedx.repositories.CustomerRepository;
import com.varun.vedx.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Long insert(Customer customer) {
		// TODO Auto-generated method stub
		Customer savedCustomerDetail = customerRepository.save(customer);
		Long customerId= savedCustomerDetail.getId();
        return customerId;
	}

}
