package com.flipmart.DTO.product;

import javax.validation.constraints.NotNull;

import com.flipmart.module.Product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDTO {

	private Integer id;
    private @NotNull String name;
    private @NotNull String imageURL;
    private @NotNull double price;
    private @NotNull String description;
    private @NotNull Integer categoryId;
    private @NotNull String categoryName;
    
    public ProductDTO(Product pdt) {
		this.setId(pdt.getProductId());
		this.setName(pdt.getProductName());
		this.setImageURL(pdt.getImage());
		this.setPrice(pdt.getPrice());
		this.setDescription(pdt.getDescription());
		this.setCategoryId(pdt.getCategory().getCategoryId());
		this.setCategoryName(pdt.getCategory().getCategoryName());
	}

	public ProductDTO(@NotNull String name, @NotNull String imageURL, @NotNull double price,
			@NotNull String description, @NotNull Integer categoryId, @NotNull String categoryName) {
		this.name = name;
		this.imageURL = imageURL;
		this.price = price;
		this.description = description;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
    
    
}
