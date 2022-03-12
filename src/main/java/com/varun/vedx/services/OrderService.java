package com.varun.vedx.services;

import java.util.List;

import com.varun.vedx.model.Order;
import com.varun.vedx.model.Product;

public interface OrderService {

	public Long insert(Order order);
	public List<Order> getAllOrder();
	public Order updateOrder();

}
