package com.flipmart.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.flipmart.exception.ProductException;
import com.flipmart.module.Product;
import com.flipmart.serviceDAO.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pLogic;
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProductsHandler() throws ProductException{
		
		return null;
	}
	
	@PostMapping("/prod")
	public ResponseEntity<Product> addProductHandler(@RequestBody Product product) throws ProductException{
		
		return null;
	}
}
