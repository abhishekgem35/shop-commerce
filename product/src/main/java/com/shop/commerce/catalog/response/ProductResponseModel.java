package com.shop.commerce.catalog.response;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseModel {

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
}