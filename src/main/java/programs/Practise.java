package programs;

public class Practise {

	public static void main(String[] args) {
		
		
		//without temp var
		
		int a = 22;
		int b = 11;
		a = a+b;//33
		b=a-b; //22
		a=a-b;//11
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		

		int temp;
		temp = a;
		a = b;
		b =temp;
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		//print duplicate arrays
		
		String arr[] = {"java","selenium","java","testng","pom","testng"};
		//String rev[] = {};
		int len = arr.length;
		for(int i=0; i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		String arr1[]= {"lav","pal","anya"};
		String arr2[]= {"pal","ila","lav","iki"};
		String arr3[]= {"var","ila","lav","pal"};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				for(int k=0;k<arr3.length;k++ ) {
					if(arr1[i]==arr2[j]) {
						if(arr1[i]==arr3[k]) {
							System.out.println(arr1[i]);
						}
						
					}
			}
			}
			
			//reverse string
			
			
		}
		
		String w = "malayalam";
		String pal = w.toUpperCase();
		String rev1 = "";
		int len1 = w.length();
		
		for(int r = len1-1;r>=0;r--) {
			rev1 = rev1+w.charAt(r);
			
		}
		if(pal.equals(rev1.toUpperCase())) {
		System.out.println("paaaaaal");
		}

	int num = 989;
	int temp2 = num;
	int rem=0;
	int sum =0;
	while(num>0) {
		rem = num%10;
		sum = (sum*10)+rem;
		num = num/10;
		
	}
	if(sum == temp2) {
		System.out.println("yayyy");
	}
	
}
}
