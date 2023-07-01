package com.avega.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.avega.dao.OrderedProductsDao;
import com.avega.dao.ProductDao;
import com.avega.daoimpl.OrderedProductsDaoImpl;
import com.avega.daoimpl.ProductDaoImpl;
import com.avega.dbutil.DBUtils;

import com.avega.pojo.OrderedProducts;
import com.avega.pojo.Product;
import com.avega.service.OrderedService;

public class OrderedServiceImpl implements OrderedService {
	static Connection connection = DBUtils.getConnection();
	PreparedStatement ps = null;
	Statement statement = null;
	static Logger logger = Logger.getLogger(OrderedServiceImpl.class.getName());

    ProductDao productDao = new ProductDaoImpl();
	
	OrderedProductsDao orderedProductsDao = null;
	
	public  OrderedServiceImpl() {
		this.orderedProductsDao = new OrderedProductsDaoImpl();
	}

	@Override
	public OrderedProducts findOrderByOrderId(String orderId) {
		return orderedProductsDao.getOrderByOrderId(orderId);
	}

	@Override
	public boolean createOrderedProducts(OrderedProducts orderedProducts) {
		return orderedProductsDao.addOrderedProducts(orderedProducts);
	}

	@Override
	public boolean removeOrderedProducts(OrderedProducts orderedProducts) {
		return orderedProductsDao.deleteOrderedProducts(orderedProducts);
	}

	@Override
	public boolean editOrderedProducts(OrderedProducts orderedProducts) {
		return orderedProductsDao.updateOrderedProducts(orderedProducts);
	}

	@Override
	public OrderedProducts findAllProductsByOrderId(String orderId) {
		ResultSet rs = null;
	    String query = "SELECT order_id,product_id,quantity,price,price*quantity as total_price FROM orderedproducts WHERE order_id =?";
	    
	    try {
	        ps = connection.prepareStatement(query);
	         ps.setString(1, orderId);
	        rs = ps.executeQuery();
	        while (rs.next()) {
	        	OrderedProducts orderedproductsdb = new OrderedProducts();
	        	Product product =productDao.getProductByProductId(rs.getString("product_id"));
	        	orderedproductsdb.setProduct(product);
	        	orderedproductsdb.setOrderId(rs.getString("order_id"));
	        	orderedproductsdb.setQuantity(rs.getInt("quantity"));
	        	orderedproductsdb.setPrice(rs.getDouble("price"));
	        	return orderedproductsdb;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    return null;
	}
	
	
	

	

}
