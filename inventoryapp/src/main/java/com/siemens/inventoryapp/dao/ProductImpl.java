package com.siemens.inventoryapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.siemens.inventoryapp.models.Product;

public class ProductImpl implements ProductDao{
	
	private Vector<Product> productList;
	
	
	public ProductImpl() {
	  this.productList=new Vector<Product>();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productList.add(product);
		return product;
	}

	@Override
	public Vector<Product> getAllProducts() {
		// TODO Auto-generated method stub
		//sort the products
		
		this.productList.sort(new ProductSorter());
		
		return this.productList;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return this.productList.stream().filter(p->p.getProductId()==productId).findFirst().orElse(null);
	}

}
