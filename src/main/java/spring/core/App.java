package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.entity.Employee;

public class App {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee bean = (Employee) ioc.getBean("emp");
		System.out.println(bean);
		
//		Employee bean2 = (Employee) ioc.getBean("emp2");
//		System.out.println(bean2);

	}

}
