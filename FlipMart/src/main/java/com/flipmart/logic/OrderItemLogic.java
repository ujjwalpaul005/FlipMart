package com.flipmart.logic;

import org.springframework.stereotype.Service;

import com.flipmart.exception.OrderException;
import com.flipmart.module.OrderItem;
import com.flipmart.serviceDAO.OrderItemService;

@Service
public class OrderItemLogic implements OrderItemService{

	@Override
	public OrderItem addOrderItem(OrderItem orderItem) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

}
