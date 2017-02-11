package com.xwd.study.spring.test.springthirdschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xwd.study.spring.thirdschema.People;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		People p = (People)ctx.getBean("cutesource1");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
