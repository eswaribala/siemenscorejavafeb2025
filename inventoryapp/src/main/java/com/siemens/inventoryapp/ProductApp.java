package com.siemens.inventoryapp;
import java.time.LocalDate;
import java.time.ZoneId;

import com.github.javafaker.Faker;
import com.siemens.inventoryapp.dao.*;
import com.siemens.inventoryapp.models.Product;
public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDao productDao=new ProductImpl();
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
			productDao.addProduct(product);		
			
		}
		
		//display the sorted products
		for(Product product1: productDao.getAllProducts())
			System.out.println(product1);
		

	}

}
