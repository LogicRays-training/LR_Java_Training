package fundamentals;

import java.io.FileReader;
import java.io.FileWriter;

public class Fileio_ReaderWriter {
	public static void main(String args[])
	{
	try 
	{
		//writing data into file
		FileWriter fw=new FileWriter("C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile5.txt");
		String str="Welcome to TOPS technology";
		
		fw.write(str);
		fw.close();
		System.out.println("\n Data write successfully");
		
		//reading data from file
		System.out.println("\n File data is:");
		FileReader rd=new FileReader("C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile5.txt");
		int ch;
		while((ch=rd.read())!=-1) 
		{
			System.out.print((char)ch);
		}
		rd.close();
	  } 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	}

}
