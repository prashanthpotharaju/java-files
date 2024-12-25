package com.prashanth.spring.boot.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(-100)
@Component
public class RunnerThree implements CommandLineRunner{

	public RunnerThree()
	{
		
		System.out.println("RunnerThree is Created......");
	}
	@Override
	public void run(String... args) throws Exception {

		System.out.println("This is  RunnerThree........");
		
		System.out.println("Sending an Email to Person :"+args[1]);
	}
//after all the bean objects are executed then only Runners are executed
	//means Order and Product is Created successfully then only Runners are executed
//if any of the object is failed to created then Runners will not executed ex:in Product
}
