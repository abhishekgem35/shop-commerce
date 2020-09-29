package com.shop.commerce.catalog.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shop.commerce.catalog.data.entity.CategoryEntity;

public interface CategoryRepository extends MongoRepository<CategoryEntity ,Long> {

}
