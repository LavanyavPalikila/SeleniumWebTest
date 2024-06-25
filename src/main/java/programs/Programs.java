package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Programs {

	public static void main(String[] args) {
		
		int a=630;
		int rem=0;
		int sum=0;
		int temp=a;
		while(a>0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		
		//System.out.println(sum);
		
		}
		if(sum==9) {
			System.out.println(temp);
		}
		
		String str = "Appium";
		String rev="";
		String[] chars= str.split("");
		Set<String> se= new LinkedHashSet<>();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		for(String ob: chars) {
			se.add(ob);
		}
		System.out.println(se);
		
		System.out.println("another pro");
		int[] so = {34,43,12,6,87,23};
		int len3 = so.length;
		int temp3;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
			if(so[i]>so[j]) {
				temp3=so[i];
				so[i]=so[j];
				so[j]=temp3;
				
			}
			}
		}
		for(int obj:so) {
			
			System.out.println(obj);
		}
		
		Map<String,String> hm = new HashMap<>();
		hm.put("n1", "lav");
		hm.put("n2", "any");
		hm.put("n3", "ayah");
		
		HashMap<String, String> hm2= new HashMap<>();
		hm2.put("n1", "lav");
		hm2.put("n2", "any");
		hm2.put("n3", "ayah");
		System.out.println("createhm" +hm);
		System.out.println("createhm" +hm2);
		
		Iterator it = hm.entrySet().iterator();
		Iterator it2=hm2.entrySet().iterator();
		//Map.Entry mp=(Map.Entry);
		Map.Entry mp1 = (Map.Entry)it2.next();
		while(it.hasNext()) {
			 it.next();
	//	System.out.println(mp.getKey());
	//	mp.getValue();
		}
		while(it2.hasNext()) {
			
			System.out.println(mp1.getKey());
			mp1.getValue();
			}
		
		
		//System.out.println(hm.equals(hm2));
		//System.out.println(hm.keySet().equals(hm2.keySet()));
		
		
}
}
