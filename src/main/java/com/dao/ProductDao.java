package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;
@Repository
public class ProductDao {
	@Autowired
	JdbcTemplate stmt;
	
	public void addProduct(ProductBean product) {
		
		stmt.update("insert into product(name, price, qty,cty) values (?,?,?,?)", product.getName(), product.getPrice(), product.getQty(), product.getCty());
	}

}