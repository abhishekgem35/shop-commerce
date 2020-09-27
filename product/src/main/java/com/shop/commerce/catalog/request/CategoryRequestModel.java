package com.shop.commerce.catalog.request;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="category")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryRequestModel {
	
	
	@NotNull(message="categoryId cannot be null")
	@Id
	@Indexed(unique=true)
	private String categoryId;
	
	@NotNull(message="categoryDescription cannot be null")
	private String categoryDescription;

}
