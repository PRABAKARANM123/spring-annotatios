package spring_common_annotation_1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // it set a Bean as default as primary
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("Hi im your Science Teacher");
		System.out.println("My name is Krarthick");

	}

}
