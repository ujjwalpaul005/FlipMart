package com.flipmart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CartException extends Exception {

	public CartException(String str) {
		super(str);
	}
}
