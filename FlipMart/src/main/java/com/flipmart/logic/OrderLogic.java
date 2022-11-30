package com.flipmart.logic;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.stereotype.Service;

import com.flipmart.exception.CustomerException;
import com.flipmart.exception.OrderException;
import com.flipmart.module.Customer;
import com.flipmart.module.OrderItem;
import com.flipmart.serviceDAO.OrderService;

@Service
public class OrderLogic implements OrderService{

	@Override
	public List<Order> getAllOrders() throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(Integer orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrderByCustomer(Integer custId) throws CustomerException, OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order changeOrderStatus(Integer orderId, String status) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItem> getAllItemsInOrder(Integer orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String placeOrder(Customer customer) throws CustomerException, OrderException {
		// TODO Auto-generated method stub
		return null;
	}

}
