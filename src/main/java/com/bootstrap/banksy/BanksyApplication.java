package com.bootstrap.banksy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan({"com.bootstrap.banksy.core.mapper"})
@EnableAutoConfiguration(exclude = {
		org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class BanksyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanksyApplication.class, args);
	}
}
