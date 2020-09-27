package com.shop.commerce.catalog.controllers;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.commerce.catalog.request.ProductRequestModel;
import com.shop.commerce.catalog.service.ProductService;
import com.shop.commerce.catalog.shared.ProductDTO;
import com.shop.commerce.catalog.*;

@RestController
@RequestMapping("/product")
public class productController {
	

	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String status()
	{
		return "Product Service Up on port" +env.getProperty("local.server.port");
	}
	
	@PostMapping
	public String insertProduct(@Valid @RequestBody ProductRequestModel productReq)
	{
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		productDTO productDto=modelMapper.map(productReq, productDto.class);
		productService.insertProduct(productDto);
		return "Create user method invoked";
		
	}

	@RequestMapping
	public String showProduct(String productId)
	{
		return productId;
		
	}
	
	
	
	@GetMapping
	public String showAllProduct(String categoryId)
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
