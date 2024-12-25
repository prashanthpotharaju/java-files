package com.prashanth.spring.boot.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(-2)
@Component

public class RunnerTwo implements ApplicationRunner{

	
	public RunnerTwo()
	{
		System.out.println("RunnerTwo is Created....");
	}
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("This is RunnerTwo :run()");
		String[] data=args.getSourceArgs();
		System.out.println("Sending an email to person:"+data[1]);
		System.out.println("Contact Number:"+data[2]);
		
	}

}
