package com.shop.commerce.catalog.request;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="product")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductRequestModel {
	
    private long productId;
    private List<Long> categoryIDs;
    private String name;
    private double salePrice;
    private double listPrice;
    private String defaultImage;
    private String overview;
    private int quantity;
    private String description;
    private int rank;
    private List<Long> skuIDs;

}
