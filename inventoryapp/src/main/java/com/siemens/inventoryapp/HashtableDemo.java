package com.siemens.inventoryapp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.Map;

import com.github.javafaker.Faker;
import com.siemens.inventoryapp.dao.*;
import com.siemens.inventoryapp.models.Product;
public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductHTDao productHTDao=new ProductHTImpl();
		Faker faker=new Faker();
		Product product=null;
		for(int i=0;i<10;i++) {
			
			LocalDate date=faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			product=new Product(faker.number().numberBetween(1L, 10000L),
					faker.commerce().productName(),
				    Double.parseDouble(faker.commerce().price()),
					date.plusYears(1),
					date,
					faker.number().numberBetween(100, 10000L)
					);
			productHTDao.addProduct(product);	
			
		}
		
		//retrieve all products
		
	 Iterator<Map.Entry<Long, Product>> itr=
			 productHTDao.getAllProducts().entrySet().iterator();
	 while(itr.hasNext()) {
		 Map.Entry<Long, Product> entry=itr.next();
		 System.out.println(entry.getKey()+","+entry.getValue());
	 }
	 
	 System.out.println("Streaming");
	 
	 productHTDao.getAllProducts().entrySet()
	 .stream()
	 .forEach(x->System.out.println(x.getKey()+","+x.getValue()));
	 
		
		
	}

}
