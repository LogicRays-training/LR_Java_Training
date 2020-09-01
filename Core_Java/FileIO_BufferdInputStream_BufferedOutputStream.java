package fundamentals;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIO_BufferdInputStream_BufferedOutputStream {

	public static void main(String[] args) {
	try
	{
	//Writing data into file
	String path="C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile2.txt";
	FileOutputStream fout=new FileOutputStream(path);
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	String data="My name is Nivedita and I am Java tariner";
	byte b[]=data.getBytes();//It convert string to byte
	
	bout.write(b);//it will write entire string of byte into path file
	
	System.out.println("\n File content write successfully");
	
	bout.close();
	
	
	//Read content from file
	System.out.println("\n\n Content of file is:\n");
	FileInputStream fin=new FileInputStream(path);
	BufferedInputStream bin=new BufferedInputStream(fin);
	int ch;
	while((ch=bin.read())!=-1)//EOF is -1
	{
		System.out.print((char)ch);
	}
	bin.close();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

	}

}
