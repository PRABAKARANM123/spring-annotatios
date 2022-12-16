package spring_common_annotation_1;

public class College {

	public Principal principal;
	public Teacher teacher;
	

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}

	public void test() {
		principal.showPrincipalInfo();
		teacher.teach();
		System.out.println("Testing this call method");
	}

}
