package com.shop.commerce.catalog.service;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.commerce.catalog.data.entity.CategoryEntity;
import com.shop.commerce.catalog.data.entity.ProductEntity;
import com.shop.commerce.catalog.data.repository.CategoryRepository;
import com.shop.commerce.catalog.data.repository.ProductRepository;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
	
	CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryServiceImpl (CategoryRepository categoryRepository)
	{
		this.categoryRepository=categoryRepository;
	}
	
	@Override
	public CategoryEntity insertCategory(CategoryEntity categoryInfo) {

		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CategoryEntity categoryEntity=modelMapper.map(categoryInfo, CategoryEntity.class);
		categoryRepository.save(categoryEntity);
		return null;

}

	@Override
	public CategoryEntity getProduct(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
}