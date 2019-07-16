package com.dream.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.dream.springcloud"})
@ComponentScan("com.dream.springcloud")
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptConsumer8000_Fegin_App {

	public static void main(String[] args) {
	 
		SpringApplication.run(DeptConsumer8000_Fegin_App.class, args);
	}
}
