package com.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
		
	//@Pointcut("execution(* Operation.*(..))")   //All methods of Operation class
	@Pointcut("execution(* Operation.m(..))")     //Only m()
	public void k(){							//Pointcut Name
		System.out.println("Method k");   //This is meaningless, as it is never called.
	}
	
	//@Before("k()")
	@After("k()")
	public void myAdvice2(JoinPoint jp){         //, Object res, Object ret  //With this parameters it was giving error.
		System.out.println("*** Advice called Before/After Pointcut .. ***");
		System.out.println("Method Signature : " + jp.getSignature());
	}
	
	@AfterThrowing(pointcut="execution(* Operation.myThrowableMethod())", throwing="ex")
	//@AfterThrowing(pointcut="within(com.spring.aop.aspectj.Operation.*)", throwing="ex")
	public void doRecoveryActions(InsufficientBalaanceException ex){              //Note that the method parameter and throwing name is same i.e. "ex" here. 
		System.out.println("---- Need to do some recovery actions here. Balance = " + ex.getBalance());
	}
	
	@AfterReturning(pointcut="execution(* Operation.*(..))",  returning="result")
	public void myAdvice(JoinPoint jp, Object result){
	      System.out.println("Additional concern");  
	      System.out.println("Method Signature: "  + jp.getSignature());  
	      System.out.println("Result in advice: "+ result);  
	      System.out.println("End of after returning advice...");  
	}
	
	//Custom Annotation handling - Interceptor
	@Around("@annotation(LogExecutionTime)")  //Around advice is a special advice which requires ProceedingJoinPoint as argument.
	public Object logExecutionTime(ProceedingJoinPoint jointpoint) throws Throwable{
		long startTime = System.currentTimeMillis();		
		Object proceed = jointpoint.proceed();
		long executionTime = startTime - System.currentTimeMillis();
		System.out.println(jointpoint.getSignature() + " executed in " + executionTime + " ms");
		return proceed;
	}
	
}
