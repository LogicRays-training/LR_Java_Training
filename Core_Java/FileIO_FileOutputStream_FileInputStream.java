package fundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIO_FileOutputStream_FileInputStream {

	public static void main(String[] args) {
	try
	{
	//Writing data into file
	String path="C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile1.txt";
	FileOutputStream fout=new FileOutputStream(path);
	
	String data="My name is Nivedita and I am Java tariner";
	byte b[]=data.getBytes();//It convert string to byte
	
	fout.write(b);//it will write entire string of byte into path file
	
	System.out.println("\n File content write successfully");
	
	fout.close();
	
	
	//Read content from file
	System.out.println("\n\n Content of file is:\n");
	FileInputStream fin=new FileInputStream(path);
	int ch;
	while((ch=fin.read())!=-1)//EOF is -1
	{
		System.out.print((char)ch);
	}
	fin.close();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

	}

}
