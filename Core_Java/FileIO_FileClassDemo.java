package fundamentals;

import java.io.File;
import java.io.IOException;

public class FileIO_FileClassDemo {

	public static void main(String[] args) {
	String path="C:\\Users\\Nivedita\\Desktop\\LogicRays_Traing\\FileIO_Data\\myfile6.txt";
	
	File fl=new File(path);
	try
	{
		if(fl.createNewFile())
		{
			System.out.println("\n File is exist");
		}
		else
		{
			System.out.println("\n File is already created");
		}
		
		if(fl.canWrite())
		{
			System.out.println("\n We can write into File  ");
		}
		else
		{
			System.out.println("\n File is readonly so we can not write in to it");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
