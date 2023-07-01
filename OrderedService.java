package com.avega.service;

import com.avega.pojo.OrderedProducts;

public interface OrderedService {
	
	OrderedProducts findOrderByOrderId(String orderId);
	boolean createOrderedProducts(OrderedProducts orderedProducts);
	boolean removeOrderedProducts(OrderedProducts orderedProducts);
	boolean editOrderedProducts(OrderedProducts orderedProducts);
	OrderedProducts findAllProductsByOrderId(String orderId);

}
