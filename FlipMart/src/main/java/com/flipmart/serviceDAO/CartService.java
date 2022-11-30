package com.flipmart.serviceDAO;

import com.flipmart.DTO.cart.AddToCartDTO;
import com.flipmart.DTO.cart.CartDTO;
import com.flipmart.DTO.cart.CartItemDTO;
import com.flipmart.exception.CartException;
import com.flipmart.exception.CustomerException;
import com.flipmart.module.Cart;

public interface CartService {

	public CartDTO getCartByCustomer(Integer custId) throws CartException, CustomerException;
	
	public Cart addToCart(AddToCartDTO addToCartDTO, Integer custId) throws CartException, CustomerException;
	
	public Cart deleteCart(Integer cartId, Integer CustId) throws CartException;
	
	public CartItemDTO getCartDtoFromCart(Cart cart);
}
