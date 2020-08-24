package com.ecommerce.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

	public List<Purchase> findByDateofpurchase(Date date);
	
//	public List<Purchase> findByCname(String name);
}
