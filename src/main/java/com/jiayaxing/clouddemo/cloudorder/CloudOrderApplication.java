package com.jiayaxing.clouddemo.cloudorder;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2Doc
public class CloudOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudOrderApplication.class, args);
	}

}
