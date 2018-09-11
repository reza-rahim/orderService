package com.redislabs.orderService.model;

import java.util.ArrayList;

public class Order {
	
	String user = "";
	String orderNumber ="";
	String totalQty = "";
	float totalPrice = 0.0F;
	ArrayList<Cart> items = null;
	
	public Order(String user, String orderNumber,String totalQty, float totalPrice, ArrayList<Cart> items  ) {
		this.user = user;
		this.orderNumber = orderNumber;
		this.totalQty = totalQty;
		this.totalPrice = totalPrice;
		this.items = items;
	}
	
	public Order() {
		
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
	public String getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ArrayList<Cart> getItems() {
		return items;
	}
	public void setItems(ArrayList<Cart> items) {
		this.items = items;
	}

}
