package programs;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String word = "Selenium Yo";
		int len = word.length();
		String rev="";
		for(int i = len-1; i>=0 ; i--) {
			rev = rev + word.charAt(i);
		}
		System.out.println(rev);
		//2nd method
		StringBuffer str = new StringBuffer(word);
		System.out.println(str.reverse());

	}
	
	
}
