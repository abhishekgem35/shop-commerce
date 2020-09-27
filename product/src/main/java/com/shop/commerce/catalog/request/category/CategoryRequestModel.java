package com.shop.commerce.catalog.request.category;

import javax.persistence.Id;
import javax.persistence.Transient;
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
	
	@Transient
    public static final String SEQUENCE_NAME = "category";
	
	@NotNull(message="categoryId cannot be null")
	@Id
	@Indexed(unique=true)
	private long categoryId;
	
	@NotNull(message="categoryDescription cannot be null")
	private String categoryDescription;

}
