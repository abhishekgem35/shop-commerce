package com.shop.commerce.catalog.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.commerce.catalog.data.repository.CategoryRepository;
import com.shop.commerce.catalog.data.repository.ProductRepository;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String status()
	{
		return "Category Service Up on port" +env.getProperty("local.server.port");
	}
	

	@GetMapping
	public String listAllProduct(String categoryId)
	{
		return categoryId ;
		
	}
	
	@RequestMapping
	public String updateProduct(String productId)
	{
		return productId ;
		
	}
	
	@RequestMapping
	public String deleteProduct(String productId)
	{
		return productId ;
		
	}
}
