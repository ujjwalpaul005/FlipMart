package com.flipmart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FeedbackException extends Exception {

	public FeedbackException(String str) {
		super(str);
	}
}
