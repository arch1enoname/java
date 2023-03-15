package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.example.demo.BeanConfig.class);
		Object ob = context.getBean("bean1");
		System.out.println(context.getBean("bean3"));
	}

}
