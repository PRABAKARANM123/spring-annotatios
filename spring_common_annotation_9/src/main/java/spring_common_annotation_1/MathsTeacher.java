package spring_common_annotation_1;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements Teacher {

	public void teach() {
		System.out.println("Hi im your Maths Teacher");
		System.out.println("My name is Prabakaran");

	}

}
