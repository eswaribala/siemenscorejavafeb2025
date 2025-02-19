package com.siemens.inventoryapp.dao;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.siemens.inventoryapp.models.Product;

public interface ProductHTDao {
	Product addProduct(Product product);
	Map<Long,Product> getAllProducts();
	Product getProductById(long productId);
}
