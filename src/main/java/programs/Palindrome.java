package programs;

public class Palindrome {

	public static void main(String[] args) {
		//integer palindrome
		int num = 98489;
		int rem = 0;
		int sum = 0;
		int temp;
		temp = num;
		
		while(num>0) {
			rem = num%10;//1 5 1
			sum = (sum*10)+rem; //1 15 151
			num = num/10; //15 1
		}
		
		if(temp == sum) {
			System.out.println("Num is palindrome");
		}

		else {
			System.out.println("Num is not palindrome");
		}
	
	
	//string palindrome
	
	String word = "Malayalam";
	String temp1 = word.toUpperCase();
	
	int len = word.length();
	String rev = "";
	for(int i = len-1 ; i>=0; i--) {
		rev = rev+word.charAt(i);
	}
	//System.out.println(rev);
	
	if(rev.toUpperCase().equals(temp1)) {
		System.out.println("Word is palindrome");
	}
	else {
		System.out.println("Word is not palindrome");
	}
}	
}

