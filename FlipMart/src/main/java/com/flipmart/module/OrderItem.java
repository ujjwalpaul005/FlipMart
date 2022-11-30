package com.flipmart.module;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	
	private @NotNull double price;
	private @NotNull int quantity;
	private @NotNull Date date;
	
	@ManyToOne
	private Orders order;
	
	@OneToOne
	private Product product;

	public OrderItem(@NotNull double price, @NotNull int quantity, Orders order, @NotNull Product product) {
		this.price = price;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
		this.date = new Date();
	}
	
	
}
