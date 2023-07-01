package com.avega.dao;


import com.avega.pojo.OrderedProducts;

public interface OrderedProductsDao {
	
	OrderedProducts getOrderByOrderId(String orderId);
	boolean addOrderedProducts(OrderedProducts orderedProducts);
	boolean deleteOrderedProducts(OrderedProducts orderedProducts);
	boolean updateOrderedProducts(OrderedProducts orderedProducts);

}
