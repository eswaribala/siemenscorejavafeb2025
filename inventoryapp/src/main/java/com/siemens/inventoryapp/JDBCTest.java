package com.siemens.inventoryapp;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

import com.github.javafaker.Faker;
import com.siemens.inventoryapp.dao.ProductJDBCDAO;
import com.siemens.inventoryapp.dao.ProductJDBCImpl;
import com.siemens.inventoryapp.models.Product;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faker faker=new Faker(); LocalDate
		 * date=faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).
		 * toLocalDate(); Product product=new Product(faker.number().numberBetween(1L,
		 * 10000L), faker.commerce().productName(),
		 * Double.parseDouble(faker.commerce().price()), date.plusYears(1), date,
		 * faker.number().numberBetween(100, 10000L) );
		 */
		try {
			ProductJDBCDAO productJDBCDao=new ProductJDBCImpl();
			//System.out.println(productJDBCDao.addProduct(product));
			/*
			 * for(Product product : productJDBCDao.getAllProducts())
			 * System.out.println(product);
			 */
			System.out.println(productJDBCDao.deleteProductById(7221));
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
