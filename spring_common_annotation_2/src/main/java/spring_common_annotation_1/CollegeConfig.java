package spring_common_annotation_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	// this is another way to create Bean
	//@Bean(name = "collBean")  
	@Bean
	public College collegeBean() { // if we does not specify Bean name this 'collegeBean' <- is bean id 
		College college = new College();
		return college;
	}

}
