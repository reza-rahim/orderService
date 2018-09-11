package com.redislabs.orderService.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;


@Service
public class OrderService {
	
   Jedis jedis = new Jedis("10.0.16.10", 6379);
	
	
	public List<Order> getOrders(String user) {
		

        List<Order> orders = new ArrayList<>();
		
		Set<String> orderIdx = jedis.smembers("all-orders:"+user);
		
		orderIdx.stream().forEach((order) -> {
			
			Map<String, String> values = jedis.hgetAll("orders:"+order);
			Order ordr = new Order(values.get("user"), values.get("orderNumber"), values.get("totalQty"), 
					               Float.parseFloat(values.get("totalQty")), null);
			
			orders.add(ordr);
		});
		
		return null;
	}

public void createOrders() {
		
		return;
	}

}
