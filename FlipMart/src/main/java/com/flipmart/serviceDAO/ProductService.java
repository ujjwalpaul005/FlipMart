package com.flipmart.serviceDAO;

import java.util.List;

import com.flipmart.DTO.product.ProductDTO;
import com.flipmart.exception.ProductException;
import com.flipmart.module.Product;

public interface ProductService {

	public List<ProductDTO> getAllProducts() throws ProductException;
	
	public Product getProductById(Integer pdtId) throws ProductException;
	
	public Product addProduct(ProductDTO productDto) throws ProductException;
	
	public Product deleteProduct(Integer pdtId) throws ProductException;
	
	public Product updateProduct(Integer pdtId, ProductDTO productDto) throws ProductException;
	
	public ProductDTO getProductDTOfromProduct(Product pdt);
	
	public Product getProductfromProductDTO(ProductDTO pdtDto);
}
