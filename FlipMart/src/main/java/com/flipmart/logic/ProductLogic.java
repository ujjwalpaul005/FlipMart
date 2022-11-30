package com.flipmart.logic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipmart.DTO.product.ProductDTO;
import com.flipmart.exception.ProductException;
import com.flipmart.module.Product;
import com.flipmart.repository.ProductRepo;
import com.flipmart.serviceDAO.ProductService;

@Service
public class ProductLogic implements ProductService{

	@Autowired
	private ProductRepo pRepo;

	@Override
	public List<ProductDTO> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer pdtId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(ProductDTO productDto) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(Integer pdtId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Integer pdtId, ProductDTO productDto) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO getProductDTOfromProduct(Product pdt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductfromProductDTO(ProductDTO pdtDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
