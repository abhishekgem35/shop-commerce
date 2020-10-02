package com.shop.commerce.catalog.request;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductRequestModel {
	
 /*   private String productId;
    private List<Long> categoryIDs;
    private String productDesc;
    private double salePrice;
    private double listPrice;
    private String defaultImage;
    private String overview;
    private int quantity;
    private String description;
    private int rank;
    private List<Long> skuIDs;*/

    @NotNull(message="productId cannot be null")
    private String productId;

    @NotNull(message="productDesc cannot be null")
    private String productDesc;

    @NotNull(message="productCategory cannot be null")
    private String productCategory;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull(message="Start Date cannot be null")
    private Date productStartDate;

    @NotNull(message="ImageURL cannot be null")
    private String productImageUrl;

    private String producVideoUrl;

    @NotNull(message="Product staus should be Active/Inactive")
    private String active;

    @NotNull(message="Price cannot be null")
    private double price;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull(message="Created Date cannot be null")
    private Date createdDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull(message="Last Modified Date cannot be null")
    private Date lastModifiedDate;

}
