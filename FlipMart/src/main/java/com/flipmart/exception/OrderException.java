package com.flipmart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OrderException extends Exception {

	public OrderException(String str) {
		super(str);
	}
}
