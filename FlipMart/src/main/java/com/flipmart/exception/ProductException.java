package com.flipmart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductException extends Exception {

	public ProductException(String str) {
		super(str);
	}
}
