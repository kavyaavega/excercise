package com.avega.client;


import java.sql.Date;
import java.util.Arrays;

import com.avega.pojo.Customer;
import com.avega.pojo.Order;
import com.avega.service.CustomerService;
import com.avega.service.OrderService;
import com.avega.serviceimpl.CustomerServiceImpl;
import com.avega.serviceimpl.OrderServiceImpl;

public class OrderTestClient {

	public static void main(String[] args) {
		OrderService  orderService = new OrderServiceImpl();
	
		//System.out.println(orderService.findOrderByOrderId("OR111"));
		
		//System.out.println(orderService.findOrderByCustomerId("CU103"));
		
		//System.out.println(orderService.createOrder(new Order("OR115",new Customer("CU104","naveen","7th cross jaynagar",15236),Date.valueOf("2023-06-26"),1500)));
		
		//System.out.println(orderService.editOrder(new Order("OR115",new Customer("CU104","naveen","7th cross jaynagar",15236),Date.valueOf("2023-06-26"),5000)));
				
		//System.out.println(orderService.removeOrder(new Order("OR115",new Customer("CU104","naveen","7th cross jaynagar",15236),Date.valueOf("2023-06-26"),5000)));
		
		//sort
		/*Order  orderlist[] = {
				new Order("OR111",new Customer("CU101","kavya","4th cross vijaynagar",123456),Date.valueOf("2023-06-30"),1000),
				                 new Order("OR112",new Customer("CU102","gokul","5th cross indiranagar",2345123),Date.valueOf("2023-06-29"),2000),
				                 new Order("OR113",new Customer("CU103","lingesh","6th cross jaynagar",32112),Date.valueOf("2023-06-28"),3000),
		                         };
		Arrays.sort(orderlist);
		System.out.println(Arrays.toString(orderlist));*/
	}             

	}


