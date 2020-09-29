package com.shop.commerce.catalog.response;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="product")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseModel {
	
	@Transient
    public static final String SEQUENCE_NAME = "prod";
	
	@NotNull(message="productId cannot be null")
	@Id
	@Indexed(unique=true)
	private long productId;
	
	@NotNull(message="productDesc cannot be null")
	private String productDesc;
	
	@NotNull(message="productCategory cannot be null")
	private String productCategory;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@NotNull(message="Start Date cannot be null")
	private Date productStartDate;
	
	@NotNull(message="ImageURL cannot be null")
	private String productImageUrl;
	
	private String producVideoUrl;
	
	@NotNull(message="Product staus should be Active/Inactive")
	private String active;
	
	@NotNull(message="Price cannot be null")
	private double price;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@NotNull(message="Created Date cannot be null")
	private Date createdDate;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@NotNull(message="Last Modfied Date cannot be null")
	private Date lastModifiedDate;

}
