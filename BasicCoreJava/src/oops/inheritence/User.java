package oops.inheritence;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telephone phone= new Telephone();		
		phone.calling();

		Mobile mobile= new Mobile();
		mobile.calling();
		mobile.texting();
		
		Smartphone smartPhone= new Smartphone();		
		smartPhone.calling();
		smartPhone.texting();
		smartPhone.videoCalling();
				
				
	}

}
