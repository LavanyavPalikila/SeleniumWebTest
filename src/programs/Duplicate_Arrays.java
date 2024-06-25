package programs;

public class Duplicate_Arrays {

	public static void main(String[] args) {
		//{1,2,3,4,5};
		String arr1[] = {"Java", "C" , "Python" , "Ruby"};
		String arr2[] = {"HTML", "C++" , "C" , "Java"};

		for(int i = 0 ; i<arr1.length ; i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
		
	}

}
