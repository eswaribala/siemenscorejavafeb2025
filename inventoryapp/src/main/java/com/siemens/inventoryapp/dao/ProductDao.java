package com.siemens.inventoryapp.dao;

import java.util.List;

import com.siemens.inventoryapp.models.Product;

public interface ProductDao {
	
	Product addProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(long productId);

}
