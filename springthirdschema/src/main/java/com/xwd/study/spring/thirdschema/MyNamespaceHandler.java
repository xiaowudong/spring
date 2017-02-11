package com.xwd.study.spring.thirdschema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());  // TODO Auto-generated method stub
		registerBeanDefinitionParser("xwdref", new XWDRefBeanDefinitionParser());
	}

}
