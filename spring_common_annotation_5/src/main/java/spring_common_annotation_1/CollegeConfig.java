package spring_common_annotation_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college = new College();
		//setter injection
		college.setPrincipal(principalBean());// college dependent on principal
		return college;
	}

}
