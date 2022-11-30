package com.flipmart.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	
	@OneToOne
	private Customer customer;
	
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
