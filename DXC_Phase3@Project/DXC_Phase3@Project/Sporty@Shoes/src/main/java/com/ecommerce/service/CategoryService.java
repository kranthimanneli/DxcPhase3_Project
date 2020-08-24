package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.Category;

public interface CategoryService {

	public Category addCategory(Category category) throws BussinessException;
	
	public Category updateCategory(Category category) throws BussinessException;
	
	public Category getCategoryById(int id) throws BussinessException;
	
	public void deleteCategoryCyId(int id) throws BussinessException;
	
	public List<Category> getAllCategories() throws BussinessException;
	
	 public List<Category> getCategoryByName(String name) throws BussinessException;
	
	
}
