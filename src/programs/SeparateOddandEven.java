package programs;

public class SeparateOddandEven {

	public static void main(String[] args) {
		
		int arr[] = {2,5,12,14,17,25};
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]%2==0) {
				System.out.println("Num is even" +arr[i]);
			}
			else
				System.out.println("Num is odd" +arr[i]);
			}
		}

	}


