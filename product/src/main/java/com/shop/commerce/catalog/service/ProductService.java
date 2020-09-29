package com.shop.commerce.catalog.service;

import com.shop.commerce.catalog.data.entity.ProductEntity;

public interface ProductService {

	ProductEntity insertProduct(ProductEntity productInfo);
	ProductEntity getProduct(String productId);
}
