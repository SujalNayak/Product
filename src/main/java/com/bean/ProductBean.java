package com.bean;

import jakarta.validation.constraints.*;


public class ProductBean {
	
	private int id;
	@NotBlank
	private String name;
	@NotNull
	private int price;
	@NotNull
	private int qty;
	@NotBlank
	private String cty;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getCty() {
		return cty;
	}
	public void setCty(String cty) {
		this.cty = cty;
	}
	
}
