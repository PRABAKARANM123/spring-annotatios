package spring_common_annotation_1;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	public void test() {
		System.out.println("Testing this call method");
	}

}
