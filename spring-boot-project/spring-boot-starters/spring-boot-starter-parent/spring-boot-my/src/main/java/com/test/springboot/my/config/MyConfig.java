package com.test.springboot.my.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class MyConfig {

	@Bean
	public Date date(){
		System.out.println("初始化 date！！！");
		return new Date();
	}
}
