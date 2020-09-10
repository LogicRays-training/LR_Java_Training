package fundamentals;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_List_ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	
	System.out.println("\n Arraylist al initially:"+al);
	//add elemnt into arraylist
	al.add("Nivedita");
	al.add("Preet");
	al.add("Priya");
	al.add("Nivedita");
	al.add(null);
	al.add(null);
	
	System.out.println("\n Arraylist al after adding elemnt:"+al);
	al.add(2, "Ajit");
	
	System.out.println("\n Arraylist al after adding elemnt:"+al);
	Iterator< String> itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println("\n Elemnt from list is:"+itr.next());
	}
	ArrayList al_new=new ArrayList<>();//Generic arraylist
	System.out.println("\n Arraylist al_new initially:"+al_new);
	
	al_new.add(10.20);
	al_new.add(289);
	al_new.add("LogicRays");
	System.out.println("\n Arraylist al_new after adding elemnt:"+al_new);
	
	al_new.addAll(al);//entire list into another list
	System.out.println("\n Arraylist al_new after adding al:"+al_new);
	
	al_new.addAll(1, al);
	System.out.println("\n Arraylist al_new after adding al at index 1:"+al_new);
	
	
	System.out.println("\n Arraylist al_new after adding al:"+al_new);
	System.out.println("\n Size of arraylist al_new:"+al_new.size());
	al_new.removeAll(al);
	System.out.println("\n Arraylist al_new after removing al:"+al_new);
	
	
	System.out.println("\n Arraylist al before removing index 2 elemnt:"+al);
	al.remove(2);
	System.out.println("\n Arraylist al after removing index 2 elemnt:"+al);
	al.remove("nivedita");
	System.out.println("\n Arraylist al after removing  elemnt:"+al);
	
	
	
	}

}
