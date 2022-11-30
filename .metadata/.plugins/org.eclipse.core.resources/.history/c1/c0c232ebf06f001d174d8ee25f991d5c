package com.flipmart.module;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date createDate;
	
	@ManyToOne
	private Product product;
	
	@OneToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
	private Customer customer;
	
	private int quantity;

	public Cart(Product product, Customer customer, int quantity) {
		super();
		this.product = product;
		this.customer = customer;
		this.quantity = quantity;
		this.createDate = new Date();
	}
	
	
}
