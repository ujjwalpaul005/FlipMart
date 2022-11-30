package com.flipmart.module;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryId;
	
	@Column(unique = true)
	private @NotBlank String categoryName;
	private @NotBlank String description;
	private @NotBlank String image;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	Set<Product> product;

	public Category(@NotBlank String categoryName, @NotBlank String description, @NotBlank String image) {
		this.categoryName = categoryName;
		this.description = description;
		this.image = image;
	}

	public Category(@NotBlank String categoryName, @NotBlank String description) {
		this.categoryName = categoryName;
		this.description = description;
	}

	public Category(@NotBlank String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}
