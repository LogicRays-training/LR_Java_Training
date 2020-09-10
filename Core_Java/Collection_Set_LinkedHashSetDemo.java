package fundamentals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_Set_LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> al=new LinkedHashSet<>();
		
		System.out.println("\n HashSet al initially:"+al);
		//add elemnt into arraylist
		al.add("Nivedita");
		al.add("Preet");
		al.add("Priya");
		al.add("Nivedita");
		al.add(null);
		al.add(null);
		
		System.out.println("\n HashSet al after adding elemnt:"+al);
		
		al.remove("Nivedita");
		System.out.println("\n HashSet al after removing elemnt:"+al);

		
		Iterator< String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println("\n Elemnt from list is:"+itr.next());
		}

	}

}
