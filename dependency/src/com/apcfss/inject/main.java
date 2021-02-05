package com.apcfss.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      info te = (info) context.getBean("inf");
	     // te.pit();
		info i = new info(null);
		System.out.println("name:"+i.name);
System.out.println("age:"+i.age);

	}
}
