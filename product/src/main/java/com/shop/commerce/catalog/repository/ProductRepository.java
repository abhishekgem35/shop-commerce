package com.shop.commerce.catalog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shop.commerce.catalog.model.ProductRequestModel;

@Repository
public interface ProductRepository extends MongoRepository<ProductRequestModel ,Long> {

}
