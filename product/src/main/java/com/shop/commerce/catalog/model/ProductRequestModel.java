package com.shop.commerce.catalog.model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="product")

public class ProductRequestModel {
	
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
	

	public long getProductId() {
		return productId;
	}
	public long setProductId(long l) {
		return this.productId = l;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Date getProductStartDate() {
		return productStartDate;
	}
	public void setProductStartDate(Date productStartDate) {
		this.productStartDate = productStartDate;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public String getProducVideoUrl() {
		return producVideoUrl;
	}
	public void setProducVideoUrl(String producVideoUrl) {
		this.producVideoUrl = producVideoUrl;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
