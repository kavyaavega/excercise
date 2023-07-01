package com.avega.dao;

import com.avega.pojo.Order;

public interface OrderDao {
	Order getOrderByOrderId(String orderId);
	boolean addOrder(Order order);
	boolean deleteOrder(Order order);
	boolean updateOrder(Order order);

}
