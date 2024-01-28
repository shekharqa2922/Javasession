package Read;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Readallfile {

	public static void main(String[] args) throws IOException {
	     
	      File directoryPath = new File("D:\\SampleDirectory");
	     
	      File filesList[] = directoryPath.listFiles();
	       System.out.println("List of files and directories in the specified directory:");
	      Scanner sc = null;
	      StringBuffer sb = new StringBuffer();
	      for(File file : filesList)
	      {
	         System.out.println("File name: "+file.getName());
	         System.out.println("File path: "+file.getAbsolutePath());
	         System.out.println("Size :"+file.getTotalSpace());
	         //Instantiating the Scanner class
	         sc= new Scanner(file);
	         String input;
	         while (sc.hasNextLine()) {
	            input = sc.nextLine();
	            sb.append(input+" ");
	         }
	         System.out.println("Contents of the file: "+sb.toString());
	         System.out.println(" ");        
	           
	         FileOutputStream fileOut = new FileOutputStream("D:\\SampleDirectory\\output.txt");
	         //Instantiating the DataOutputStream class
	         DataOutputStream outputStream = new DataOutputStream(fileOut);
	         
	         outputStream.write(sb.toString().getBytes());
	         outputStream.flush();
	         System.out.println("Data entered into the file");
	      }
	   }
	}