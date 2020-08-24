package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	private MultiValueMap<String, String> map;
	
	@PostMapping("/category")
	public Category addCategory(@RequestBody  Category category) throws BussinessException {
		
		
			return service.addCategory(category);
		
	}

	@PutMapping("/category")
	public Category updateCategory(@RequestBody  Category category) throws BussinessException {
		
		
			return service.updateCategory(category);
		
		
	}

	@GetMapping("/category/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
		 try {
				return new ResponseEntity<>(service.getCategoryById(id), HttpStatus.OK);
			} catch (BussinessException e) {
				map=new LinkedMultiValueMap<>() ;
				map.add("ErrorMessage", e.getMessage());
				return new ResponseEntity<>(null,map, HttpStatus.NOT_FOUND);
			}
		
	}

	@DeleteMapping("/category/{id}")
	public void deleteCategoryCyId(@PathVariable int id) throws BussinessException {
		
			service.deleteCategoryCyId(id);
		
		
	}

	@GetMapping("/categories")
	public List<Category> getAllCategories() throws BussinessException {
		
		return service.getAllCategories();
	}
	
	@GetMapping("/categories/name/{name}")
    public List<Category> getCategoryByName(@PathVariable String name) throws BussinessException {
		
		return service.getCategoryByName(name);
	}
}
