package com.siemens.inventoryapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.siemens.inventoryapp.models.Product;

public interface ProductJDBCDAO {
	
	Product addProduct(Product product) throws SQLException,ClassNotFoundException;
	
	List<Product> getAllProducts()throws SQLException,ClassNotFoundException;
	
	Product getProductById(long productId);
	
	boolean deleteProductById(long productId);
	

}
