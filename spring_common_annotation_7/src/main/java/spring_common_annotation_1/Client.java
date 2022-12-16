package spring_common_annotation_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College coll = context.getBean("college", College.class);
		System.out.println("The college object created by spring is "+coll);
		coll.test();
		
	}

}
