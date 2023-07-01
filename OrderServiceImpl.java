package com.avega.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.avega.dao.CustomerDao;
import com.avega.dao.OrderDao;
import com.avega.daoimpl.CustomerDaoImpl;
import com.avega.daoimpl.OrderDaoImpl;
import com.avega.dbutil.DBUtils;
import com.avega.pojo.Customer;
import com.avega.pojo.Order;
import com.avega.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	static Connection connection = DBUtils.getConnection();
	PreparedStatement ps = null;
	Statement statement = null;
	static Logger logger = Logger.getLogger(OrderServiceImpl.class.getName());
	
	CustomerDao customerDao = new CustomerDaoImpl();
	
	OrderDao orderDao = null;
	
	public OrderServiceImpl() {
		this.orderDao = new OrderDaoImpl();
	}
	
	List<Order> orders = new ArrayList<>();
	

	@Override
	public Order findOrderByOrderId(String orderId) {
		return orderDao.getOrderByOrderId(orderId);
	}

	@Override
	public boolean createOrder(Order order) {	
		return orderDao.addOrder(order);
	}

	@Override
	public boolean removeOrder(Order order) {
		return orderDao.deleteOrder(order);
	}

	@Override
	public boolean editOrder(Order order) {
		return orderDao.updateOrder(order);
	}

	@Override
	public Order findOrderByCustomerId(String customerId) {
		ResultSet rs = null;
	    String query = "SELECT * FROM orders WHERE customer_id = ?";
	    
	    try {
	        ps = connection.prepareStatement(query);
	        ps.setString(1, customerId);
	        rs = ps.executeQuery();
	        while (rs.next()) {
	        	Order orderdb = new Order();	
	        	
	        	Customer customer = customerDao.getCustomerByCustomerId(rs.getString("customer_id"));
	        	orderdb.setCustomer(customer);
	        	orderdb.setOrderId(rs.getString("order_id"));
	        	orderdb.setOrderDate(rs.getDate("order_date"));
	        	orderdb.setOrderValue(rs.getInt("order_value"));
	        	return orderdb;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    return null;	
	}

}
