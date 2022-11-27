package com.flipmart.module;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
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
