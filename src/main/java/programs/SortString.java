//=============INCOMPLETE=============
package programs;

public class SortString {

	public static void main(String[] args) {
		String sort ="";
		String word = "program";
		int len = word.length();
		for(int i=0; i<len; i++) {
			for(int j=1;j<len-1;j++) {
				if(word.charAt(i)<word.charAt(j)) {
					sort = sort+word.charAt(i);
					//sort = word.charAt(i);
				}
			}
		}

		System.out.println(sort);
	}

}
