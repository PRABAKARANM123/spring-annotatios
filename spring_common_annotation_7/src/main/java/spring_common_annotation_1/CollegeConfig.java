package spring_common_annotation_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring_common_annotation_1")
public class CollegeConfig {
/*	
	@Bean
	public Teacher teacherBen() {
		return new MathsTeacher();
	}

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public College collegeBean() {
		College college = new College();
		college.setTeacher(teacherBen());
		college.setPrincipal(principalBean());
		return college;
	}
*/
}
