package spring_common_annotation_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	public Principal principal;

	@Autowired
	public Teacher teacher;

	public void test() {
		principal.showPrincipalInfo();
		teacher.teach();
		System.out.println("Testing this call method");
	}

}
