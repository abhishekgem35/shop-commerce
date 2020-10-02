package com.shop.commerce.catalog.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCategoryRequestModel {
	
	private Long parentId;

    @NotNull
    @NotBlank
    private String name;
    private Integer position;
    private String description;

}
