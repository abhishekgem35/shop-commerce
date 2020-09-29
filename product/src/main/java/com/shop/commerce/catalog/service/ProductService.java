package com.shop.commerce.catalog.service;

import com.shop.commerce.catalog.shared.ProductDTO;

public interface ProductService {

	ProductDTO insertProduct(ProductDTO productInfo);
	ProductDTO getProduct(String productId);
}
