package com.prashanth.api.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prashanth.api.dto.OrderDetailsDto;

@FeignClient("order-service")//ORDER MICRO-SRVICE ID
public interface OrderServiceFeignClient {

	
	@PostMapping("/order/add")//context-path with rest api uri
	public String addOrder(@RequestBody OrderDetailsDto orderDetailsDto);//method signature of order-service /add
}
