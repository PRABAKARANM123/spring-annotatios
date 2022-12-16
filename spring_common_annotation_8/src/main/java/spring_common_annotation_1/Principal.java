package spring_common_annotation_1;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	public void showPrincipalInfo() {
		System.out.println("Hi i'm your Principal");
		System.out.println("My name is James Bond");
	}

}
