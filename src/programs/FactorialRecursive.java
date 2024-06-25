package programs;

public class FactorialRecursive {

	public static int rf(int rn) { 
		
		if(rn==0)
			return 1;
		else
			return (rn*rf(rn-1));
		
	}
	
	public static void main(String[] args) {
		System.out.println(rf(15));
		//without recursive
		int fact=1;
		int num = 15;
		for(int i=1;i<=num;i++) {
			  fact = fact*i;
			
		}

		System.out.println(fact);
	
	
	
	   String str = "My name is Chaitanya";
       //regular expression is a whitespace here 
       String[] arr = str.split(" "); 
 
       for (String s : arr) 
           System.out.println(s);
	}

}
