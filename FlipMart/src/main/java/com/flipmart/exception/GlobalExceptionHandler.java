package com.flipmart.exception;

import java.time.LocalDate;
import java.util.InputMismatchException;

import javax.el.MethodNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorTemplate> productexceptionHandler(ProductException pe, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), pe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<ErrorTemplate> categoryexceptionHandler(CategoryException pe, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), pe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<ErrorTemplate> customerexceptionHandler(CustomerException ce, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), ce.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(FeedbackException.class)
	public ResponseEntity<ErrorTemplate> feedbackexceptionHandler(FeedbackException fe, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), fe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<ErrorTemplate> orderexceptionHandler(OrderException oe, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), oe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(CartException.class)
	public ResponseEntity<ErrorTemplate> cartexceptionHandler(CartException ce, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), ce.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodNotFoundException.class)
	public ResponseEntity<ErrorTemplate> methodNotFoundExceptionHandler(MethodNotFoundException me, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), me.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InputMismatchException.class)
	public ResponseEntity<ErrorTemplate> inputMismatchExceptionHandler(InputMismatchException pe, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), pe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorTemplate> ExceptionHandler(Exception e, WebRequest req){
		ErrorTemplate myErr = new ErrorTemplate(LocalDate.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<ErrorTemplate>(myErr, HttpStatus.BAD_REQUEST);
	}
}
