package programs;

public class Practise_2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DUPLICATE ARRAYS:
		String arr1[] = {"sodium", "Potas", "Calc", "Nerves", "2378", "4356"};
		String arr2[] = {"jerk", "Potas", "YES", "Nerves", "2378", "3456"};
		for (int i=0; i<arr1.length ; i++) {
			for (int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Duplicate arrays are: " + arr1[i]);
				}
			}
		}
		
		
//LARGEST AND SMALLEST NUMBERS:
	
		int[] num = {5,12,-90, -878, 98, 98789, 88989};
		int small = num[0];
		int large = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]<small) {
				small = num[i];
			}
			else if(num[i]>large) {
				large = num[i];
			}
		}
			System.out.println("smallest num is :"+ small);
			System.out.println("largest num is :" +large);
		
//PALINDROME:
		
		int pnum = 98489;
		int rem =0;
		int sum =0;
		int tmp;
		tmp = pnum;
		while(pnum>0) {
			rem = pnum%10;
			sum = (sum*10)+rem;
			pnum = pnum/10;
		}
		
		if(sum == tmp) {
			System.out.println("its palindrome");
		}
		
		else 
			System.out.println("not a pal");
		
//String palindrome
		String pstrng = "Malayalam";
		String temp = pstrng.toUpperCase();
		String rev = "";
		for(int i=pstrng.length()-1; i>=0; i--) {
			rev = rev+pstrng.charAt(i);
		}
		System.out.println(rev);
		if(rev.toUpperCase().equals(temp)) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("not palindrome string");
		}
	}
	
	
}


	


