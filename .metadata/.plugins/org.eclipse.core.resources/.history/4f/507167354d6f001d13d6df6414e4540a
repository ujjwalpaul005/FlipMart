package com.flipmart.module;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	private Date orderDate;
	private double totalPrice;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItem;
	
	
}
