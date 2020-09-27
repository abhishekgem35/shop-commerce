package com.shop.commerce.catalog.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.commerce.catalog.data.repository.ProductRepository;
import com.shop.commerce.catalog.request.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String status()
	{
		return "Product Service Up on port" +env.getProperty("local.server.port");
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
