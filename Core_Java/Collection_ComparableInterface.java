package fundamentals;

import java.util.ArrayList;
import java.util.Collections;

class Student_cmp implements Comparable<Student_cmp>{  
int rollno;  
String name;  
int age;  

@Override
public int compareTo(Student_cmp obj) {
	if(age==obj.age)  
	return 0;  
	else if(age>obj.age)  
	return 1;  
	else  
	return -1; 
}

Student_cmp(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}

public class Collection_ComparableInterface {

	public static void main(String[] args) {
    Student_cmp s1=new Student_cmp(11,"Nivedita",29);
    Student_cmp s2=new Student_cmp(12,"Preet",25);
    Student_cmp s3=new Student_cmp(14,"Priya",39);
    Student_cmp s4=new Student_cmp(15,"Amisha",20);
    
    ArrayList<Student_cmp> al=new ArrayList<>();
    al.add(s1);
    al.add(s2);
    al.add(s3);
    al.add(s4);
   System.out.println("\n Collection before sorting:");
   for(Student_cmp st:al){  
	   System.out.println(st.rollno+" "+st.name+" "+st.age);  
	   }  
   
   Collections.sort(al);//automatically call compareTo()
   
   System.out.println("\n\n Collection after sorting:");
   for(Student_cmp st:al){  
	   System.out.println(st.rollno+" "+st.name+" "+st.age);  
	   }  
   
   
	}

}
