package programs;

public class SumofNumbers {

	
	static int getNum(int n) {
		int rem=0;
		int sum1=0;
		while(n!=0) {
			rem = n%10; //4 3 2
			sum1=sum1+rem; //4 7 9
			n=n/10; //23 2
		//	System.out.println(sum1);
		}
		return sum1;
	}	
		static void setNum() {
		for(int i=69;i<=99;i++) {
		if(getNum(i)==9) 
			System.out.println("Num is " +i);
		}
		
	}
	
	public static void main(String[] args) {
		
		String num = "234";
		int sum =0;
		for(int i=0;i<num.length();i++) {
			sum=sum+num.charAt(i)-48;
		//System.out.println(sum);
		if(sum==9) {
			//System.out.println("sum of num is 9");
		}
	}
		
		setNum();
		
}
}
