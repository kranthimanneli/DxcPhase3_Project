package com.ecommerce.service;

import java.util.Date;
import java.util.List;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.Purchase;

public interface PurchaseService {

	public Purchase addPurchase(Purchase purchase);
	
	public Purchase updatePurchase(Purchase purchase);
	
	public Purchase getPurchaseById(int id) throws BussinessException;
	
	public List<Purchase> getPurchaseByDateOfPurchase(Date date);
	
//	public List<Purchase> getPurchaseByCategory(String name);
	
	public List<Purchase> getAllPurchases();
	
	public void deletePurchaseById(int id);
}
