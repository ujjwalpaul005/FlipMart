package com.flipmart.DTO.cart;

import javax.validation.constraints.NotNull;

import com.flipmart.module.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartItemDTO {

	private Integer id;
	
	@NotNull
	private Product product;
	
	@NotNull
	private Integer quantity;
}
