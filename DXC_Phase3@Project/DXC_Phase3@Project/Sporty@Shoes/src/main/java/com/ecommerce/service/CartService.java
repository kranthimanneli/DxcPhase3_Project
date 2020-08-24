package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.Cart;

public interface CartService {

	public Cart addCart(Cart cart) throws BussinessException;
	
	public Cart updateCart(Cart cart) throws BussinessException;
	
	public Cart getCartById(int id) throws BussinessException;
	
	public void deleteCartById(int id) throws BussinessException;
	
	public List<Cart> GetAllCarts() throws BussinessException;
	

}
