package com.flipmart.module;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private String fisrtName;
	private String lastName;
	private String mobile;
	
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "customer")
	private List<Orders> order;

	public Customer(String fisrtName, String lastName, String mobile, String email, String password) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}
	
	
	
}
