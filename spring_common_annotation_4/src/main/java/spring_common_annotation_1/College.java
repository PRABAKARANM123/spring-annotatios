package spring_common_annotation_1;

public class College {
	
	public Principal principal;
	
	public College(Principal principal) {
	
		this.principal = principal;
	}

	public void test() {
		principal.showPrincipalInfo();
		System.out.println("Testing this call method");
	}

}
