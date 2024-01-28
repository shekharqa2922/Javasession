package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Createfile {
	//creating a file
	public static void createfile(String filepath)
	{
		File myobj=new File(filepath);
		try {
			if(myobj.createNewFile())
			{
				System.out.println("file is created:"+myobj.getName());
			}
			else
			{
				System.out.println("file is already exist.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//writing data into file
	
	public static void writefile(String filepath) 
	{
		try
		{
		FileWriter mywrite=new FileWriter(filepath);
		mywrite.write("welcome to java file handling");
		mywrite.close();
		System.out.println("successfully wrote the file");
	}
	catch(IOException e)
	{
		System.out.println("error occured");
		e.printStackTrace();
	}
	}
	
	//Read data from file
	public static void Readfile(String filepath)
	{
		try
		{
		File myobj=new File(filepath);
		Scanner myreader=new Scanner(myobj);
		
		while(myreader.hasNextLine())
		{
			String data=myreader.nextLine();
			System.out.println(data);
		}
		myreader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
//Rename the file
	
	public static void renamefile(String oldfilepath ,String newfilepath)
	{
		File Oldfile=new File(oldfilepath);
		File newfile=new File(newfilepath);
		
		if(Oldfile.renameTo(newfile))
		{
			System.out.println("file is renamed");
		}
		else
		{
			System.out.println("the file cant be renamed");
		}
	}
	
	//delete the file
	
	public static void deletefile(String filepath)
	{
		File myobj=new File(filepath);
		if(myobj.delete())
		{
			System.out.println("deleted the file scuucessully:"+myobj.getName());
		}
		else
		{
			System.out.println("failed to delete tech file");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="D:\\FileHandling\\myfile.txt";
		createfile(filepath);
		writefile(filepath);
		Readfile(filepath);
		String filepathnew="D:\\FileHandling\\myfile1.txt";
		renamefile(filepath,filepathnew);
		deletefile(filepathnew);
	}

}
