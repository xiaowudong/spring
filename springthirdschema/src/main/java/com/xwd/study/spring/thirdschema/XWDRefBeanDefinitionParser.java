package com.xwd.study.spring.thirdschema;

import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;  
import org.springframework.util.StringUtils;  
import org.w3c.dom.Element; 
public class XWDRefBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{
	protected Class getBeanClass(Element element) {
        return Object.class;
    }
    protected void doParse(Element element, BeanDefinitionBuilder bean) { 
    	String interfaceName=element.getAttribute("localInterface");
		LocalProxy handler =new LocalProxy();
		try {
			Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),new Class[]{Class.forName(interfaceName)}, handler);
		} catch (IllegalArgumentException | ClassNotFoundException e) {
			e.printStackTrace();
		}  
    }  
}
