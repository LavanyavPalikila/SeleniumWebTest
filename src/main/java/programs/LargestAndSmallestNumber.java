package programs;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int arr[] = {12,-10,0,-80,9787,9};
		int len = arr.length;
		int smallest = arr[0];
		int largest = arr[0];
		for(int i=1; i<len ; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
			else if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	
	
	String str = "I love my my country India";
	String w3 = "";
	String[] str1 = str.split(" ",5);
	int len3 = str1.length;
	//for(String a : str1)
		for(int i = 0;i<len3-1;i++) {
			for(int j =i+1;j<len3-1;j++) {
				w3 = w3+str1.length;
				System.out.println(w3);
			}
		
		}
	
	
	}

}
