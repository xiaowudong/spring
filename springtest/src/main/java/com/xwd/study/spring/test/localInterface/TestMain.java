package com.xwd.study.spring.test.localInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		RemoteInerface ri = (RemoteInerface)ctx.getBean("xwdref");
		ri.doSomething("xwd");

	}

}
