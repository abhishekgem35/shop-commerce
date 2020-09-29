package com.shop.commerce.catalog.controllers;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.commerce.catalog.data.entity.ProductEntity;
import com.shop.commerce.catalog.request.ProductRequestModel;
import com.shop.commerce.catalog.response.ProductResponseModel;
import com.shop.commerce.catalog.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	

	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String status()
	{
		return "Product Service Up on port" +env.getProperty("local.server.port");
	}
	
	@PostMapping(value="/product" ,
			consumes = { MediaType.APPLICATION_JSON_VALUE } ,
			produces = { MediaType.APPLICATION_JSON_VALUE } )
	public String insertProduct(@Valid @RequestBody ProductRequestModel productReq)
	{
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ProductEntity productDto=modelMapper.map(productReq, ProductEntity.class);
		productService.insertProduct(productDto);
		return "Product Inserted";
		
	}

	@GetMapping(value="/product/{productId}" , produces = { MediaType.APPLICATION_JSON_VALUE } )
	public ResponseEntity<ProductResponseModel> getProduct(@PathVariable("productId") String productId)
	{
		
		if(productId==null) {
			//Exception handling
			
		}
		
		ProductEntity productDto=productService.getProduct(productId);
		ProductResponseModel productInfo=new ModelMapper().map(productDto, ProductResponseModel.class);
		return ResponseEntity.status(HttpStatus.OK).body(productInfo);
		
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
