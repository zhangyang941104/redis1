package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zhangyang")
public class RedisNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisNewApplication.class, args);
	}

}
