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
	}

}
