package com.shop.commerce.catalog.shared;

import java.io.Serializable;
import java.util.Date;

public class ProductDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productId;
	private String productDesc;
	private String productCategory;
	private Date productStartDate;
	private String productImageUrl;
	private String producVideoUrl;
	private String active;
	private double price;
	private Date createdDate;
	private Date lastModifiedDate;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
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
