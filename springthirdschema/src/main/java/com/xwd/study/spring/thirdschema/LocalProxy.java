package com.xwd.study.spring.thirdschema;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.json.JSONObject;


public class LocalProxy implements InvocationHandler {
	private String id;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method:"+method.getName()+"  args:"+JSONObject.valueToString(args));
		return "LocalProxy invoke return";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
