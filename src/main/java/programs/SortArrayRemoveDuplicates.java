package programs;

import java.util.Arrays;



public class SortArrayRemoveDuplicates {

	public static void rd() {
		int[] arr= {30,20,50,10,5,50,20};
	
	int index=1;
	int len = arr.length;
	for(int i=0;i<len-1;i++) {
		if(arr[i]!=arr[i+1]) {
			arr[index++] = arr[i+1];
			System.out.println(arr[index]);
		}
		
	}

	
	}
	public static void main(String[] args) {
		//System.out.println(rd());
		//rd();
		int[] arr= {30,20,50,10,5,50,20};
		int[] rd = {};
		Arrays.sort(arr);
		String arr1 = Arrays.toString(arr);
		System.out.println(arr1);
//		
//		int len = arr1.length();
//		for(int i=0;i<len;i++) {
//			if(arr[i]!=arr[i+1]) {
//				//rd = rd+arr[i];
//			}
//		}
//		
		
		
		
	}

}
