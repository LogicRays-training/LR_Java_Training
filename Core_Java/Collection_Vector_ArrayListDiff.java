package fundamentals;

import java.util.ArrayList;
import java.util.Vector;

public class Collection_Vector_ArrayListDiff {

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
		
		//Vector
		 Vector<String> vec = new Vector<String>();  
         //Adding elements using add() method of List  
         vec.add("Nivedita");  
         vec.add("Pooja");  
         vec.add("Priya");  
         vec.add("Janki");  
         //Adding elements using addElement() method of Vector  
         vec.addElement("LogicRays");  
         vec.addElement("Ahmedabad");  
         vec.addElement("Surat");  
           
         System.out.println("Elements are: "+vec); 
         
         Vector<String> vec1 = new Vector<String>(4);  
         System.out.println("Size is: "+vec1.size());  
         System.out.println("Default capacity is: "+vec1.capacity());
         
         vec1.add("Nivedita");  
         vec1.add("Pooja");  
         vec1.add("Priya");  
         vec1.add("Janki"); 
         System.out.println("Size is: "+vec1.size());  
         System.out.println("Default capacity is: "+vec1.capacity());
         
         vec1.add("Nivedita");  
         vec1.add("Pooja");  
         System.out.println("Size is: "+vec1.size());  
         System.out.println("Default capacity is: "+vec1.capacity());

	}

}
