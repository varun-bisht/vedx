package com.varun.vedx.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.vedx.model.Order;
import com.varun.vedx.model.Product;
import com.varun.vedx.repositories.OrderRepository;
import com.varun.vedx.repositories.ProductRepository;
import com.varun.vedx.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;

	
	@Override
	public Long insert(Order order) {
		// TODO Auto-generated method stub
		Order savedOrderDetail = orderRepository.save(order);
		Long orderId= savedOrderDetail.getId();
        return orderId;
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order updateOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
