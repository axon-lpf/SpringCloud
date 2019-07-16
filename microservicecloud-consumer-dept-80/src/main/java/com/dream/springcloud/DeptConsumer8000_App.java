package com.dream.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.dream.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)  //自定義負載均衡
public class DeptConsumer8000_App {

	public static void main(String[] args) {
	 
		SpringApplication.run(DeptConsumer8000_App.class, args);
	}
}
