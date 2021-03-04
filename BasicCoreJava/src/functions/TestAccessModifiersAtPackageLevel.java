package functions;

public class TestAccessModifiersAtPackageLevel {

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		
		obj.defaultFunction();
		obj.protectedFunction();
		obj.publicFunction();

	}

}
