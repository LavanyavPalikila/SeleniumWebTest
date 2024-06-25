package programs;

import org.testng.annotations.Test;

public class Duplicate_Arrays {

	public static void main(String[] args) {
		//{1,2,3,4,5};
		/*String arr1[] = {"Java", "C" , "Python" , "Ruby"};
		String arr2[] = {"Java", "C++" , "C" , "w2wwd"};

		for(int i = 0 ; i<arr1.length ; i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j] && i!=j) {
					System.out.println(arr1[i]);
				}
			}
			
		}
		
		String  l = "297398237lavanya38383hgd8b8b";
		String numbers;
		numbers = l.replaceAll("[^0-9]", "");
		System.out.println(numbers);*/
		
		String s = "Lavanya is a good girl";
		System.out.println(s);
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
		String s2= s.replace(" ", "");
		System.out.println(s2);
		
		
		
	}
	

}
