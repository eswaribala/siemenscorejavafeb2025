package com.siemens.inventoryapp.dao;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.siemens.inventoryapp.models.Product;

public class ProductHTImpl implements ProductHTDao{
	
	private Map<Long,Product> productMap=new Hashtable<Long,Product>();
	

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productMap.put(product.getProductId(), product);
		return product;
	}

	@Override
	public Map<Long, Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productMap;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		Entry<Long,Product> entryResult= productMap
				.entrySet()
				.stream()
				.filter(entry->entry.getKey()==productId)
				.findFirst().orElse(null);
		if(entryResult!=null)
		  return entryResult.getValue();
		else
			return null;
	}

}
