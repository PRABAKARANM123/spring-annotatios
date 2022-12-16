package spring_common_annotation_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College coll = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is "+coll);
		coll.test();
		
	}

}
// container context read the CollegeConfig file instead of beans.xml file and go 
// CollegeConfig class and through the @ComponentScane annotation read the base package 
// that we are provided and create the Bean which classes annotated with @Component
// annotation in that package and store in context or container
