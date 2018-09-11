package com.redislabs.orderService.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redislabs.orderService.model.Order;
import com.redislabs.orderService.model.OrderService;




@RestController
public class orderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping("/getOrder/{user}") 
	List<Order> getOrders(@PathVariable String user) {
		
		return orderService.getOrders(user);
	}
	

}
