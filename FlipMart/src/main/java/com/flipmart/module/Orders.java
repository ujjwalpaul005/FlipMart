package com.flipmart.module;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private String orderStatus;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItem;
	
	
}
