package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Print_uniqueChar_inString {

	public static void main(String[] args) {
		// to print unique char in string

		String str = "appium";
		String[] chars = str.split("");
		Set<String> unqcha = new LinkedHashSet<>();
		for(String s : chars) {
			unqcha.add(s);		}
		System.out.println(unqcha);
		
		int[] arr = {1,2,3,4,6};
		int len = arr.length;
		int sum =0;
		for(int i=0;i<=len-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	

	
	int  i1 =50;
	int j1=10;
	int k1=1;
	int sum1=0;
	while(k1<=j1) {
		sum1=sum1+i1; 
		k1++;
	}
	System.out.println(sum1);
	
	
	int[] adj= {1,4,8,16,25,37};
	int adjlen = adj.length;
	int diff=0;
	for(int a=0;a<adjlen-1;a++) {
		if(adj[a+1]-adj[a]>diff) {
			diff = adj[a+1]-adj[a];
			
		}
		
	}
	System.out.println(diff);
	
	//compare indexes
	int[] a= {9,8,4,9,3};
	int[] b = {8,2,4,7,3};
	//String unique = "";
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=0;i<a.length;i++) {
		if(a[i]==b[i]) {
			al.add(a[i]);	
		}
	}
	
	System.out.println(al);
	Object[] ob = al.toArray();
	
	for(Object obj : ob) {
		System.out.println(obj);
	}
	
	System.out.println("//sort Array");
	
	int[] x = {2,6,1,3,5,8,1,3,10,9};
	
	int temp;
	for(int i=0;i<x.length;i++) {
		for(int j=i+1;j<x.length;j++) {
			if(x[i]>x[j]) {
				temp = x[i];
				x[i] = x[j];
				x[j]= temp;
			}
		}
	}
	
	
	
	Set<Integer> set = new HashSet<>();
	
	for(int x1: x) {
		set.add(x1);
	
	}
	
	System.out.println(set);
	
	

}
}
