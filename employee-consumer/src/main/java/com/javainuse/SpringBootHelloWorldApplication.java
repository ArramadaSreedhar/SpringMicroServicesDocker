package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javainuse.controllers.ConsumerControllerClient;

@SpringBootApplication
public class SpringBootHelloWorldApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootHelloWorldApplication.class, args);
		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
		//SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}
