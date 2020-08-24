package com.ecommerce.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name= "users") 
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
//    @Column(nullable = false)
    private String name;
    
//    @Column(nullable = false)
    private int age;
    
//    @Column(nullable = false)
    private String address;
    
//    @Column(nullable = false)
    private Date date_added;
    
//    @Column(nullable = false)
	private String email_id;
    
//    @Column(nullable = false)
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cart_id")
	private Cart cart_id;
}