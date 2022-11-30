package com.flipmart.logic;

import org.springframework.stereotype.Service;

import com.flipmart.DTO.cart.AddToCartDTO;
import com.flipmart.DTO.cart.CartDTO;
import com.flipmart.DTO.cart.CartItemDTO;
import com.flipmart.exception.CartException;
import com.flipmart.exception.CustomerException;
import com.flipmart.module.Cart;
import com.flipmart.serviceDAO.CartService;


@Service
public class CartLogic implements CartService{

	@Override
	public CartDTO getCartByCustomer(Integer custId) throws CartException, CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart addToCart(AddToCartDTO addToCartDTO, Integer custId) throws CartException, CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart deleteCart(Integer cartId, Integer CustId) throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItemDTO getCartDtoFromCart(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

}
