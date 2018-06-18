package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * This Test example is to see the difference between Wiring and Autowiring provided by Spring framework.
 * Wiring : We use Constructor Injection using <constructor-arg ref="acc"></constructor-arg> and
 * Setter injection <property name="acc" ref="acc"></property> 
 * 
 * Autowiting : We use autowire mode to automatically call the Constructor & Setter injection using
 * <bean id="tran" autowire="byName" class="com.spring.autowiring.Transaction">
 */

public class Test {
	
	//Make sure the constructor Transaction() is commented as we have not provided constructor-arg while creating the bean tran.
	public static void TestWiringDependency(){   
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringWiring.xml");
		Account acc = (Account) context.getBean("acc");      
		acc.withdraw();
		
		Transaction tr = (Transaction) context.getBean("tran");
		tr.transact();	
	}
	
	public static void TestAutoWiringDependency(){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringAutoWiring.xml");
		//No need now to explicitly call this, Autowiring will create this dependency.
		//Account acc = (Account) context.getBean("acc");  
		//acc.withdraw();
		
		Transaction tr = (Transaction) context.getBean("tran");
		tr.transact();		
	}
	
	public static void main(String[] args) {
		
		//TestWiringDependency();
		TestAutoWiringDependency();		
	}

}