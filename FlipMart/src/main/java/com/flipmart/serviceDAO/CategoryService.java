package com.flipmart.serviceDAO;

import java.util.List;

import com.flipmart.exception.CategoryException;
import com.flipmart.module.Category;

public interface CategoryService {

	public Category addCategory(Category cat) throws CategoryException;
	
	public Category deleteCategory(Integer catId) throws CategoryException;
	
	public List<Category> getAllCategory() throws CategoryException;
	
	public Category updateCategory(Category cat) throws CategoryException;
}
