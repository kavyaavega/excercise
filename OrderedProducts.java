package com.avega.pojo;

import java.util.Objects;

public class OrderedProducts {
	
	private String orderId;
	
	public Product product;
	
	private int quantity;
	
	private double price;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public OrderedProducts(String orderId, Product product, int quantity, double price) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderedProducts [orderId=" + orderId + ", product=" + product + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderedProducts other = (OrderedProducts) obj;
		return Objects.equals(orderId, other.orderId);
	}
	
	
	
	

	
}
