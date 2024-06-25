package programs;

public class Swap {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 10;
		//with 3rd variable
//		int temp;
//		temp = b;
//		b = a;
//		a = temp;
//		System.out.println("A value is " + a);
//		System.out.println("B value is " + b);
		
		//without 3rd variable
		a = a+b; //22
		b = a-b; //22-10=12
		a = a-b; //22-12=10
		System.out.println("A value is " + a);
		System.out.println("B value is " + b);
	}

}
