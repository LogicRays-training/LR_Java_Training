package fundamentals;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIO_ByteArrayInput_OutputStream {

	public static void main(String[] args) {
		try 
		{
			//To write data into the file
			FileOutputStream out1=new FileOutputStream("C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile3.txt");
			FileOutputStream out2=new FileOutputStream("C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile4.txt");
		    
			ByteArrayOutputStream brout=new ByteArrayOutputStream();
			
			String str="My name is Nivedita and I am Java trainer";
		    
		    byte b[]=str.getBytes();//convert string into byte and store into array b
		    
		    brout.write(b);
		   
		    brout.writeTo(out1);
		    brout.writeTo(out2);
		    

		    
		    System.out.println("\n Data write successfully");
		    
		    //to read the data from file
		    System.out.println("\n File-1 content is:");
		    FileInputStream in=new FileInputStream("C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile3.txt");
		    int ch;
		    while((ch=in.read())!=-1)
		    {
		    	System.out.print((char)ch);
		    }
		    in.close();
		    
		    //to read the data from file
		    System.out.println("\n File-2 content is:");
		    FileInputStream in1=new FileInputStream("C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile4.txt");
		    int ch1;
		    while((ch1=in1.read())!=-1)
		    {
		    	System.out.print((char)ch1);
		    }
		    in1.close();
		    
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}

}
