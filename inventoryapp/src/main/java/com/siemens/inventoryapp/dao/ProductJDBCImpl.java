package com.siemens.inventoryapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.siemens.inventoryapp.helpers.MySQLHelper;
import com.siemens.inventoryapp.models.Product;

public class ProductJDBCImpl implements ProductJDBCDAO
{
	
	private static Connection connection;
	private PreparedStatement preparedStatement;
	private Statement statement;
	private ResultSet resultSet;
	private ResourceBundle resourceBundle;
	
	public ProductJDBCImpl() throws ClassNotFoundException, SQLException {
		
		resourceBundle=ResourceBundle.getBundle("db");
	}
	

	@Override
	public Product addProduct(Product product) throws SQLException, ClassNotFoundException {
		String query=resourceBundle.getString("addProduct");
		int rows=0;
		try {
		connection=MySQLHelper.getConnection();
		if(connection!=null)
		{
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setLong(1, product.getProductId());
			preparedStatement.setString(2,product.getProductDescription());
			preparedStatement.setDouble(3, product.getUnitPrice());
			preparedStatement.setDate(4, Date.valueOf(product.getDoe()));
			preparedStatement.setDate(5, Date.valueOf(product.getDop()));
			preparedStatement.setLong(6, product.getAvailableQty());
			rows=preparedStatement.executeUpdate();
		}else
			return null;
		}
		finally {
			connection.close();
		}
		// TODO Auto-generated method stub
		if(rows>0) 
	     	return product;
		else
			return null;
	}

	@Override
	public List<Product> getAllProducts() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String query=resourceBundle.getString("selectAllProducts");
		Product product=null;
		List<Product>productList=new ArrayList<>();
		try {
		connection=MySQLHelper.getConnection();
		if(connection!=null)
		{
			statement=connection.createStatement();
			resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				product=new Product(resultSet.getLong(1)
						,resultSet.getString(2),
						resultSet.getDouble(3),
						resultSet.getDate(4).toLocalDate(),
						resultSet.getDate(5).toLocalDate(),
						resultSet.getLong(6));
				productList.add(product);
			}
			return productList;	
		}else
			return null;
		
		}
		finally {
			connection.close();
		}
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProductById(long productId) {
		// TODO Auto-generated method stub
		return false;
	}

}
