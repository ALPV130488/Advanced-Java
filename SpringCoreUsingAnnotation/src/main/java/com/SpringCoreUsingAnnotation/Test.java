package com.SpringCoreUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@ComponentScan("com.SpringCoreUsingAnnotation")
@Configuration
public class Test {
	
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("beans.xml");
//		
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
		
		Employee emp1 = (Employee)factory.getBean("emp");
		
		
		
		
		System.out.println(emp1);
		
		Address add1 =(Address)factory.getBean("add");
		
		System.out.println(add1);
		
		
		
		
		
	}

}
