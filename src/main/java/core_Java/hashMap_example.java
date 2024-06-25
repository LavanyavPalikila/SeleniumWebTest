package core_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "Lav");
		hm.put(1, "Mani");
		hm.put(2, "Tanvi");
		hm.put(3, "Bad");
		hm.put(4, "Lalli");
		hm.put(5, "Akshit");
		System.out.println(hm);
		System.out.println(hm.remove(3));
		System.out.println(hm);
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
