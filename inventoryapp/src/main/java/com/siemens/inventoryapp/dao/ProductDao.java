package com.siemens.inventoryapp.dao;

import java.util.List;
import java.util.Vector;

import com.siemens.inventoryapp.models.Product;

public interface ProductDao {
	
	Product addProduct(Product product);
	Vector<Product> getAllProducts();
	Product getProductById(long productId);

}
