package spring_common_annotation_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${college.Nmae}")
	private String collegeName;
	@Value("${college.Location}")
	private String collegeLocation;
	
	@Autowired
	private Principal principal;

	@Autowired
	private Teacher teacher;

	public void test() {
		principal.showPrincipalInfo();
		teacher.teach();
		System.out.println("College name is : "+collegeName);
		System.out.println("College location is : "+collegeLocation);
		System.out.println("Testing this call method");
	}

}
