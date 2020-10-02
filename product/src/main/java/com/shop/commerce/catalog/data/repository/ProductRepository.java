package com.shop.commerce.catalog.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shop.commerce.catalog.data.entity.ProductEntity;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity ,Long> {

    ProductEntity findById(String productId);
}
