package com.shop.commerce.catalog.service;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.commerce.catalog.data.entity.ProductEntity;
import com.shop.commerce.catalog.data.repository.ProductRepository;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
	
	ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl (ProductRepository productRepository)
	{
		this.productRepository=productRepository;
	}
	
	@Override
	public ProductEntity insertProduct(ProductEntity productInfo) {

		
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ProductEntity productEntity=modelMapper.map(productInfo, ProductEntity.class);
		productRepository.save(productEntity);
		return null;

}

	@Override
	public ProductEntity getProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}
}