package fundamentals;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; 

class Student_Demo implements Serializable{  
	int id;  
	String name;  
	public Student_Demo(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
}  
public class FileIO_SerializationDemo {

	public static void main(String[] args) {
		//Serialization of object 
		try{  
			  String path="C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\serializableDemo.txt";
			  //Creating the object  
			  Student_Demo s1 =new Student_Demo(211,"ravi");  
			  //Creating stream and writing the object  
			  FileOutputStream fout=new FileOutputStream(path);  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  
			  out.writeObject(s1);//it convert s1 java object into file object
			  out.flush();  
			  
			  //closing the stream  
			  out.close(); 			  
			  System.out.println("success");  
			  
			//De-Serialization of object 
			  FileInputStream fin=new FileInputStream(path);
			  ObjectInputStream in=new ObjectInputStream(fin);  
			  
			  Student_Demo s=(Student_Demo) in.readObject();  
			  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  }
		      catch(Exception e)
		      {
		    	   System.out.println(e);
		      }  
	}

}
