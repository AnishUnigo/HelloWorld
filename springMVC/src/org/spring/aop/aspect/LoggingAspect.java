package org.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircle()")
	public void loggingAdvice(){
		System.out.println("Advice run . Get method run");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("second Advice .");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.spring.aop.model.*)")
	public void allCircle(){}
}
