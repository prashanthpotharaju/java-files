package com.prashanth.spring.boot.jdbc.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OperationsOnOrderDetails {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void loadAllOrderDetails()
	{
		String loadQuery="select * from ordr_dtl";
		//List<OrderDetails> listOfOrders=jdbcTemplate.query(loadQuery,new BeanPropertyRowMapper<OrderDetails>(OrderDetails.class));
		List<OrderDetails> listOfOrders=jdbcTemplate.query(loadQuery,new OrderDetails());

		listOfOrders.stream().forEach(System.out::println);
	}
	
}
