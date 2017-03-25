package org.spring.aop.main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.spring.aop.model.Circle;
import org.spring.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopMain {

	public static void main(String[] args) {
	try{
	Result result=JUnitCore.runClasses(Circle.class);
	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
	ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
	System.out.println(shapeService.getCircle().getName());
	System.out.println(shapeService.getTriangle().getName());
	for(Failure failure : result.getFailures()){
		System.out.println(failure.toString());
	}
	System.out.println(result.wasSuccessful());
	}catch(Exception e){e.printStackTrace();}
	
	}
	
}
