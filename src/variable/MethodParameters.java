package variable;

public class MethodParameters {
	
	static void checkage(int age){
		
		if (age<18){
			System.out.println("True");
			
		}
		else{
			System.out.println("False");
		}
		
	}

	public static void main(String[] args) {
		checkage(20);

	}

}
