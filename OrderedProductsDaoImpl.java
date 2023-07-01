package com.avega.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;


import com.avega.dao.OrderedProductsDao;
import com.avega.dao.ProductDao;
import com.avega.dbutil.DBUtils;

import com.avega.pojo.OrderedProducts;
import com.avega.pojo.Product;

public class OrderedProductsDaoImpl implements OrderedProductsDao {
	
	static Logger logger = Logger.getLogger(DBUtils.class.getName());
    Connection connection = DBUtils.getConnection();
    PreparedStatement ps = null;
    
    ProductDao productDao = new ProductDaoImpl();

	@Override
	public OrderedProducts getOrderByOrderId(String orderId) {
		ResultSet rs = null;
	    String query = "SELECT * FROM orderedproducts WHERE order_id = ?";
	    
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

	@Override
	public boolean addOrderedProducts(OrderedProducts orderedProducts) {
		boolean isAdded = false;
		String query = "Insert into orderedproducts Values(?,?,?,?)";
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, orderedProducts.getOrderId());
			ps.setString(2, orderedProducts.getProduct().getProductId());
			ps.setInt(3, orderedProducts.getQuantity());
			ps.setDouble(4, orderedProducts.getPrice());
			 int count = ps.executeUpdate();
	            if (count > 0) {
	                logger.info("OrderedProducts added successfully!");
	                isAdded = true;
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isAdded;
	}

	@Override
	public boolean deleteOrderedProducts(OrderedProducts orderedProducts) {
		boolean isDeleted = false;
		String query = "Delete from orderedproducts WHERE order_id = ?";
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, orderedProducts.getOrderId());
			int count = ps.executeUpdate();
			if(count > 0) {
				logger.info("OrderedProducts deleted successfully");
				isDeleted= true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isDeleted;
	}

	@Override
	public boolean updateOrderedProducts(OrderedProducts orderedProducts) {
		boolean isUpdate = false;
	    String query = "UPDATE orderedproducts SET  product_id = ?,quantity = ?,price = ? Where order_id = ?";
	    try {
			ps = connection.prepareStatement(query);
			ps.setString(1,orderedProducts.getProduct().getProductId());
			ps.setInt(2, orderedProducts.getQuantity());
			ps.setDouble(3, orderedProducts.getPrice());
			ps.setString(4, orderedProducts.getOrderId());
			
			int count = ps.executeUpdate();
			if(count> 0) {
				logger.info("OrderedProducts updated successfully");
				isUpdate= true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	return isUpdate;
	}

}
