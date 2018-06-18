package com.spring.first;
/*
 * Dependency Injection Demo :
 * 1. By Constructor injection
 * 2. By Setter method injection - All the setter methods of Student will be called depending on the config.xml
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void constructorInjection(){
		ApplicationContext context = new ClassPathXmlApplicationContext("FirstSpring-CI.xml");
		Student st = (Student) context.getBean("student");
		st.show();
	}
	
	public static void setterInjection(){
		ApplicationContext context = new ClassPathXmlApplicationContext("FirstSpring.xml");
		Student st = (Student) context.getBean("student");
		st.displayInfo();
	}
	
	public static void main(String[] args) {
		//constructorInjection();          //Uncomment to test.
		setterInjection();		
	}

}
