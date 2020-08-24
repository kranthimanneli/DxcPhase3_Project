package com.ecommerce.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchase_id;
	
	private Date dateofpurchase;
	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "cart_id")
//	private Cart cart_id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user_id;
	
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
//	@JoinTable(name = "purchase_products",
//	joinColumns = @JoinColumn(name="purchase_id"),
//	inverseJoinColumns = @JoinColumn(name="product_id"))
//	List<Product> products = new ArrayList<>();

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinTable(name = "purchase_categories",
	joinColumns = @JoinColumn(name="purchase_id"),
	inverseJoinColumns = @JoinColumn(name="categorya_id"))
	List<Category> categories = new ArrayList<>();

	
	private BigDecimal total_amount;
	
}
