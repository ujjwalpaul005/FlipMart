package com.flipmart.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	
	@OneToOne
	private Customer customer;
	
	@OneToOne
	@JsonIgnore
	private Product product;
	
	private String feedback;

	public Feedback(Customer customer, String feedback) {
		super();
		this.customer = customer;
		this.feedback = feedback;
	}

	public Feedback(Customer customer) {
		super();
		this.customer = customer;
		this.feedback = "Top rated";
	}
	
	
}
