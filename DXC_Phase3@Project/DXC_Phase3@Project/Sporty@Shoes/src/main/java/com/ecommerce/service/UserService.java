package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.User;

public interface UserService {

	public User authenticate(String user_id, String password) throws BussinessException;
	
	public User addUser(User user) throws BussinessException;
	
	public User updateUser(User user) throws BussinessException;
	
	public User getUserById(int id) throws BussinessException;
	
	public void deleteUserById(int id) throws BussinessException;
	
	public List<User> getAllUsers() throws BussinessException;
	
	public List<User> getAllUsersByName(String name) throws BussinessException;
}
