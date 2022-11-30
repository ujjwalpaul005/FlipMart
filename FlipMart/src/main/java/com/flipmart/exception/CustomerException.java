package com.flipmart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerException extends Exception {

	public CustomerException(String str) {
		super(str);
	}
}
