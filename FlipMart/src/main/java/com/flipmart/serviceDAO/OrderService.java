package com.flipmart.serviceDAO;

import java.util.List;

import javax.persistence.criteria.Order;

import com.flipmart.exception.CustomerException;
import com.flipmart.exception.OrderException;
import com.flipmart.module.Customer;
import com.flipmart.module.OrderItem;

public interface OrderService {

	
	public List<Order> getAllOrders() throws OrderException;
	
	public Order getOrderById(Integer orderId) throws OrderException;
	
	public List<Order> getAllOrderByCustomer(Integer custId) throws CustomerException, OrderException;
	
	public Order changeOrderStatus(Integer orderId, String status) throws OrderException;
	
	public List<OrderItem> getAllItemsInOrder(Integer orderId) throws OrderException;
	
	public String placeOrder(Customer customer) throws CustomerException, OrderException;
}
