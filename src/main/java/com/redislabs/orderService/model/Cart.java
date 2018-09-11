package com.redislabs.orderService.model;

public class Cart {
	String user = "";
	String orderNumber ="";
	String cart = "";
	String id = "";
	String title = "";
	String qty = "";
	float price =0.0F;
	
	
	public Cart() {
		
		
	}
	
    public Cart(String user, String orderNumber, String cart, String id, 
    		String title, String qty, float price) {
		this.user = user;
		this.orderNumber = orderNumber;
		this.cart = cart;
		this.id =  id;
		this.title = title;
		this.qty = qty;
		this.price = price;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
