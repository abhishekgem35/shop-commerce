package com.shop.commerce.catalog.data.repository;


import com.shop.commerce.catalog.data.entity.CategoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryEntity,Long> {

}
