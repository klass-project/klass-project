package com.example.klass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages = "com.example.klass.dao")
public class KlassApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlassApplication.class, args);
	}
	
	/*
	 *  <bean id="userService" class="x.y.z.UserSErvice" /
	 */
	
	
	/*@Bean
	public UserService userService() {
		return new UserService();
	}
	*/
}
