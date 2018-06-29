package com.spring.first;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloWorld{
	private String message;
	
	public void getMessage() {
		System.out.println("Your message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init(){
		System.out.println("Bean is going through init.");
	}
	
	public void destroy(){
		System.out.println("Bean will be destroyed now.");
	}
	
}

class InitHelloWorld implements BeanPostProcessor{
    @Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
    	System.out.println("BeforeInitialization : " + beanname);
		return bean;
	}
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
    	System.out.println("AfterInitialization" + beanname);
    	return bean;
    }
}

public class TestBeanPostProcessor {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springBeanPostProcessor.xml");
		HelloWorld hw = (HelloWorld) context.getBean("beanHelloWorld");
		hw.getMessage();
		context.registerShutdownHook();   //This is only applicable when context is derived from AbstractApplicationContext
	}

}
