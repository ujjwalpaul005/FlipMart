package com.flipmart.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flipmart.exception.CategoryException;
import com.flipmart.module.Category;
import com.flipmart.serviceDAO.CategoryService;

@Service
public class CategoryLogic implements CategoryService{

	@Override
	public Category addCategory(Category cat) throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category deleteCategory(Integer catId) throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategory() throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Category cat) throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

}
