package com.sts.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sts.pojo.Customer;



public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Customer e =(Customer)context.getBean("CustomerBean");
	System.out.println(e);
	}

}
