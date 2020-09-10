package fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map_HashMapDemo {

	public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	
	System.out.println("\n HashMap hm initially:"+hm);
	
	hm.put(101, "Nivedita");
	hm.put(102, "Preet");
	hm.put(103, "Nivedita");
	hm.put(104, "nivedita");
	hm.put(104, "Amisha");//duplicate key is allowed but replace the value 
	System.out.println("\n HashMap hm after putting:"+hm);
	
	System.out.println("\n\n Iterating Hashmap...");  
	   for(Map.Entry m : hm.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	   
	   hm.putIfAbsent(103, "Preet"); 
	   System.out.println("\n HashMap hm after putting:"+hm);
	   
	    hm.remove(102,"Preet");  //by key  and exact value in case
		System.out.println("\n HashMap hm after removing by 102  and preet :"+hm);
		
	    hm.remove(102);  //by key 
		System.out.println("\n HashMap hm after removing by 102 key:"+hm);

	   HashMap<Integer,String> hmap=new HashMap<>();
	   hmap.put(2001, "LR");
	   hmap.putAll(hm);
	   System.out.println("\n HashMap hmap after putting hm:"+hmap);
	}

}
