package com.siemens.inventoryapp.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private long productId;
	private String productDescription;
	private double unitPrice;
	private LocalDate doe;
	private LocalDate dop;
	private long availableQty;

}
