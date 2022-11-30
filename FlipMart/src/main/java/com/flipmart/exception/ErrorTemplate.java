package com.flipmart.exception;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorTemplate {

	private LocalDate dateTime;
	private String message;
	private String description;
	
	
}
