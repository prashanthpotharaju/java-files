package com.prashanth.api.feign.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.prashanth.api.dto.PaymentDetailsDto;

@FeignClient("payement-service")//MS ID
public interface PaymentServiceFeignClient {


@GetMapping("/payment/banking/options")
	public List<String> getBankingOptions(PaymentDetailsDto paymentDetailsDto);
}
