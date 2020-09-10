package fundamentals;

import java.util.LinkedList;

public class Collection_List_LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> lllist=new LinkedList<>();
	
	System.out.println("\n Linkedlist lllist initially:"+lllist);

	lllist.add("Nivedita");
	lllist.add("Preet");
	lllist.add("Priya");
	lllist.add("Nivedita");
	
	System.out.println("\n Linkedlist lllist after adding elemnt:"+lllist);
	lllist.add(2, "Ajit");
	System.out.println("\n Linkedlist lllist after adding elemnt:"+lllist);
	lllist.addFirst("Sanjay");
	lllist.addLast("Margi");
	
	System.out.println("\n Linkedlist lllist after adding elemnt:"+lllist);
	lllist.remove("Nivedita");
	System.out.println("\n Linkedlist lllist after remove(Nivedita) elemnt:"+lllist);
	
	
	System.out.println("\n Linkedlist lllist after adding elemnt:"+lllist);
	lllist.removeFirstOccurrence("Nivedita");
	System.out.println("\n Linkedlist lllist after removeFirstOccurance() :"+lllist);
	
	
	lllist.remove();
	System.out.println("\n Linkedlist lllist after remove() :"+lllist);
	
	lllist.remove(3);
	System.out.println("\n Linkedlist lllist after remove() :"+lllist);
	
	lllist.removeFirst();
	System.out.println("\n Linkedlist lllist after remove() :"+lllist);
	
	lllist.removeFirstOccurrence("Nivedita");
	
	
	}

}
