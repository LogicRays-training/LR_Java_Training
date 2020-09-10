package fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student_cmpr{  
int rollno;  
String name;  
int age;  

Student_cmpr(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}
class AgeComparator implements Comparator<Student_cmpr>{

	public int compare(Student_cmpr s1,Student_cmpr s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}  

}  

class NameComparator implements Comparator<Student_cmpr>{  

	public int compare(Student_cmpr s1,Student_cmpr s2){  
    return s1.name.compareTo(s2.name);  
    }  
}  
public class Collection_ComparatorInterface {

	public static void main(String[] args) {
		ArrayList<Student_cmpr> al=new ArrayList<Student_cmpr>();  
		al.add(new Student_cmpr(101,"Vijay",23));  
		al.add(new Student_cmpr(106,"Ajay",27));  
		al.add(new Student_cmpr(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student_cmpr st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  	
		
		System.out.println("Sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		//Traversing the elements of list  
		for(Student_cmpr st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  	

	}

}
