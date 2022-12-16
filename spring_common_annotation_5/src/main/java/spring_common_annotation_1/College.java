package spring_common_annotation_1;

public class College {

	public Principal principal;
	// setter injection
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}

	public void test() {
		principal.showPrincipalInfo();
		System.out.println("Testing this call method");
	}

}
