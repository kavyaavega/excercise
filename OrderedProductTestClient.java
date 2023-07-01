package com.avega.client;

import com.avega.pojo.OrderedProducts;
import com.avega.pojo.Product;
import com.avega.service.OrderedService;
import com.avega.serviceimpl.OrderedServiceImpl;

public class OrderedProductTestClient {

	public static void main(String[] args) {
		OrderedService  orderedService = new OrderedServiceImpl();	
		
		//System.out.println(orderedService.findOrderByOrderId("OR111"));
		
		//System.out.println(orderedService.createOrderedProducts(new OrderedProducts("OR114",new Product("PR001","laptop",45000,1),15,3000)));
		
		//System.out.println(orderedService.editOrderedProducts(new OrderedProducts("OR114",new Product("PR001","laptop",45000,1),11,3000)));
						
		//System.out.println(orderedService.removeOrderedProducts(new OrderedProducts("OR114",new Product("PR001","laptop",45000,1),11,3000)));
		
		//System.out.println(orderedService.findAllProductsByOrderId("OR111"));

	}

}
