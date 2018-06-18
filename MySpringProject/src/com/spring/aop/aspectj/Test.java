package com.spring.aop.aspectj;
/*
 * AOP Demo exercise :
 * URL for Custom Annotation : http://www.baeldung.com/spring-aop-annotation
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Operation op = (Operation) context.getBean("opBean");
		System.out.println("Main - Calling msg()");
		op.msg("Test String");
		
		System.out.println("Main - Calling m()");
		op.m();
		
		System.out.println("Main - Callin k()");
		op.k();
		
		try {
			op.j();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try{
		  op.myThrowableMethod();
		}catch (InsufficientBalaanceException e) {
			// TODO: handle exception
		}
	}

}
