package com.shop.commerce.catalog.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.commerce.catalog.model.ProductRequestModel;
import com.shop.commerce.catalog.repository.ProductRepository;
import com.shop.commerce.catalog.service.SequenceGeneratorService;

@RestController
@RequestMapping("/product")
public class productController {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String status()
	{
		return "Product Service Up on port" +env.getProperty("local.server.port");
	}
	
	@PostMapping
	public ProductRequestModel insertProduct(@Valid @RequestBody ProductRequestModel productReq)
	{
		productReq.setProductId(sequenceGeneratorService.generateSequence(ProductRequestModel.SEQUENCE_NAME));
		return productRepository.save(productReq);
		
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
