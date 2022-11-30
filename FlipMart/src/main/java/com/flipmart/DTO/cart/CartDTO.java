package com.flipmart.DTO.cart;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartDTO {
	
	private List<CartItemDTO> cart;
	private double totalCost;
	
	
}