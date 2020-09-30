package com.shop.commerce.catalog.data.entity;

import javax.persistence.Entity;
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
@Entity
public class CategoryEntity {
	
	@Transient
    public static final String SEQUENCE_NAME = "category";
	
	@NotNull(message="categoryId cannot be null")
	@Id
	@Indexed(unique=true)
	private long categoryId;

	@NotNull(message="categoryName cannot be null")
	private String categoryName;

	@NotNull(message="categoryDescription cannot be null")
	private String categoryDescription;

	@NotNull(message="parentId cannot be null")
	private String parentId;


}
