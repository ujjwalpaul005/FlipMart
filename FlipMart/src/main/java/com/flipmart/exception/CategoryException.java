package com.flipmart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CategoryException extends Exception {

	public CategoryException(String str) {
		super(str);
	}
}
