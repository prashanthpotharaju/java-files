package com.prashanth.spring.boot.jdbc.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderDetails implements RowMapper{

	//column names and property names are different 
	private String orderDetailId;
	private String emailId;
	private String orderStatus;
	private float orderAmount;
	private boolean isOrderPlaced;
	private long contactNumber;
	public String getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public float getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}
	public boolean isOrderPlaced() {
		return isOrderPlaced;
	}
	public void setOrderPlaced(boolean isOrderPlaced) {
		this.isOrderPlaced = isOrderPlaced;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", emailId=" + emailId + ", orderStatus=" + orderStatus
				+ ", orderAmount=" + orderAmount + ", isOrderPlaced=" + isOrderPlaced + ", contactNumber="
				+ contactNumber + "]";
	}
	@Override
	public OrderDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		 OrderDetails orderDetails = new OrderDetails();
		    
		    // Map the ResultSet columns to the properties of the OrderDetails object
		    orderDetails.setOrderDetailId(rs.getString("ordr_dtl_id"));   // Maps 'ordr_dtl_id' column to 'orderDetailId' property
		    orderDetails.setEmailId(rs.getString("email_id"));            // Maps 'email_id' column to 'emailId' property
		    orderDetails.setOrderStatus(rs.getString("ordr_sts"));        // Maps 'ordr_sts' column to 'orderStatus' property
		    orderDetails.setOrderAmount(rs.getFloat("ordr_amt"));         // Maps 'ordr_amt' column to 'orderAmount' property
		    orderDetails.setOrderPlaced(rs.getBoolean("is_ordr_placed")); // Maps 'is_ordr_placed' column to 'isOrderPlaced' property
		    orderDetails.setContactNumber(rs.getLong("contact_number"));  // Maps 'contact_number' column to 'contactNumber' property
		    
		    // Return the populated OrderDetails object
		    return orderDetails;
	}
	
	
	
}
