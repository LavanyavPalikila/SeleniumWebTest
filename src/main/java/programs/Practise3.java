package programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practise3 {

	public static void main(String[] args) {
		
		String[] arr= {"Lav","Java","pal","yayy"};
		String[] arr1 = {"Java","Jee","iki","Lav","var"};
		ArrayList<String> arr3= new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					arr3.add(arr[i]);
				}
			}
		}
System.out.println(arr3);

//rev a string

String str = "Malayalam";
String rev = "";
String temp = str.toLowerCase();
int len = str.length();
for(int i=len-1;i>=0;i--) {
	rev = rev+str.toLowerCase().charAt(i);
	
}
System.out.println(rev);
System.out.println(temp);
if(rev.equals(temp)) {
	System.out.println("Pal");
}

//palindrome

int num=12325;
int temp1 =num;
int sum=0;
int rem=0;
while(num!=0) {
	rem = num%10;
	sum = (sum*10)+rem;
	num=num/10;
}

System.out.println(sum);
if(sum==temp1) {
	System.out.println("pal");
}


//unique values from str
String u = "lavanyynla";
String[] chars = u.split("");
char[] ch = u.toCharArray();
Set<String> s = new LinkedHashSet<>();
for(String o: chars) {
	s.add(o);
}
System.out.println(s);
int count;
for(int i=0;i<ch.length;i++) {
	count=1;
	for(int j=i+1;j<ch.length;j++) {
		if(ch[i]==ch[j]&& ch[i]!=' ') {
			count++;
			//ch[j]='0';
		}
		
	}
	if(count>1  && ch[i]!='0')
		System.out.println(ch[i]);
}

System.out.println("sort");
int[] sa = {9,4,1,5,2,7,9,0,5};
int temp5;
for(int i=0; i<sa.length;i++) {
	for(int j=i+1;j<sa.length;j++) {
		if(sa[i]>sa[j]) {
			temp5 = sa[i];
			sa[i]=sa[j];
			sa[j]=temp5;
		}
	}
}
//System.out.println(sa[5]);

Set<Integer> seso = new LinkedHashSet<>();
for(int sort : sa) {
	seso.add(sort);
	
}
System.out.println(seso);


	}

}
