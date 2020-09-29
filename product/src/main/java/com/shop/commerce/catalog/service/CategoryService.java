package com.shop.commerce.catalog.service;

import com.shop.commerce.catalog.data.entity.CategoryEntity;

public interface CategoryService {

	CategoryEntity insertCategory(CategoryEntity categoryInfo);
	CategoryEntity getProduct(String categoryId);
}
