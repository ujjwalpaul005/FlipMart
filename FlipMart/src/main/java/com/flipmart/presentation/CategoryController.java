package com.flipmart.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipmart.DTO.cart.CartDTO;
import com.flipmart.exception.ProductException;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@GetMapping("/all")
	public ResponseEntity<CartDTO> getCartByCustomerHandler(Integer customerId) throws ProductException{
		
		return null;
	}
}
