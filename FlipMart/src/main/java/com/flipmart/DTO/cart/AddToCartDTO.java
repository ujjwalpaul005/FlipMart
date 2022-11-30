package com.flipmart.DTO.cart;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddToCartDTO {
	
	private Integer id;
	
	@NotNull
	private Integer productId;
	
	@NotNull
	private Integer quantity;
	
	
}
