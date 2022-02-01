package variable;

public class JavaCasting {

	public static void main(String[] args) {
		//Widening Casting
		int myNum = 9;
		double myDouble = myNum;
		System.out.println(myNum);
		System.out.println(myDouble);
		
		//Narrowing Casting
		double myDbl = 9.75;
		int myint = (int) myDbl;
		
		System.out.println(myDbl);
		System.out.println(myint);

	}

}
