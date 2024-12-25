package com.prashanth.spring.boot.ci.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Orders {

	private int orderId;
	private String userName;
	private double amount;
	private Product product;
	
	public Orders()
	{
		System.out.println("#######Orders is Created##########");
	}
	
	 /*
				 * //************************ APPLICATION FAILED TO START
				 ***************************
				 * Description: Parameter 0 of constructor in
				 * com.prashanth.spring.boot.ci.orders.Orders required a bean of type 'int' that
				 * could not be found. Action: Consider defining a bean of type 'int' in your
				 * configuration.
				 */
//to avoid above ERROR use @Value below
	
	
	
	@Autowired
	public Orders(@Value("101")int orderId, @Value("Virat Kohli")String userName,@Value("8999") double amount,@Qualifier("productTwo") Product product) {
		super();
		System.out.println("###########Orders(int orderId, String userName, double amount, Product product) is created##########");
		this.orderId = orderId;
		this.userName = userName;
		this.amount = amount;
		this.product = product;
	}
	
	
	
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
