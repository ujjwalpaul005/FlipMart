package com.flipmart.serviceDAO;


import com.flipmart.exception.OrderException;
import com.flipmart.module.OrderItem;

public interface OrderItemService {

	public OrderItem addOrderItem(OrderItem orderItem) throws OrderException;
}
