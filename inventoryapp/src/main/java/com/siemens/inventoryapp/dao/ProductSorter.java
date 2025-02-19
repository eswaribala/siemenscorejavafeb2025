package com.siemens.inventoryapp.dao;

import java.util.Comparator;

import com.siemens.inventoryapp.models.Product;

public class ProductSorter implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getDoe().compareTo(o2.getDoe());
	}

}
