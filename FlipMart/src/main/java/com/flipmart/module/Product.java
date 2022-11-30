package com.flipmart.module;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

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
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private @NotNull String productName;
	private @NotNull String image;
	private @NotNull String description;
	private @NotNull double price;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy = "product")
	@JsonIgnore
	private List<Cart> cart;

	public Product(String name, String image, String description, double price, Category category) {
		super();
		this.productName = name;
		this.image = image;
		this.description = description;
		this.price = price;
		this.category = category;
	}
	
	
}
