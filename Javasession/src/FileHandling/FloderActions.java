package FileHandling;

import java.io.File;

public class FloderActions {

	
		// TODO Auto-generated method stub
//create floder
		public static void createFolder(String floderpath)
		{
			File folder=new File(floderpath);
			if(! folder.exists())
			{
				folder.mkdir();
				System.out.println("floder created:"+floderpath);
			}
			
		}
		
//check if floder is exist or not		
		public static boolean checkfloderexists(String floderpath)
		{
			File folder=new File(floderpath);
			return folder.exists();
		}
		//rename floder 
		public static void renamefloder(String oldpath,String newpath)
		{
			File olderfloder=new File(oldpath);
			File newfolder=new File(newpath);
			
			if(olderfloder.exists())
			{
				olderfloder.renameTo(newfolder);
				System.out.println("floder renamed to :"+newpath);
			}
			
		}
		//delete folder 
		
		public static void deletefloder(String floderpath)
		{
			File floder=new File(floderpath);
			if(floder.exists())
			{
				for (File file:floder.listFiles())
				{
				file.delete();
				}
				floder.delete();
				System.out.println("Floder deleted:" +floderpath);
			}
		}
		public static void main(String[] args)
		{
			String floderpath="D:\\filehandling";
			createFolder(floderpath);
			boolean floderexists=checkfloderexists(floderpath);
			System.out.println("floder exist:"+floderexists);
			
			String newFloderpath="D:\\newFilhandling";
			renamefloder(floderpath,newFloderpath);
			
			deletefloder(newFloderpath);
		}
	}


