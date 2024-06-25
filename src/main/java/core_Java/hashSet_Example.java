package core_Java;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> b = new HashSet<String>();
		
		b.add("UK");
		b.add("US");
		b.add("Sydney");
		b.add("India");
		System.out.println(b);
		b.remove("US");
		System.out.println(b);
		System.out.println(b.isEmpty());
		System.out.println(b.size());
		System.out.println(b.contains("UK"));
		b.add("Germany");
		b.add("Korea");
		b.add("paris");
		b.add("bali");
		
		System.out.println(b);
		Iterator<String> it = b.iterator() ;
		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
