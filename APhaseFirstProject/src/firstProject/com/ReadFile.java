//read file work successfully  not working
package firstProject.com;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
	@SuppressWarnings({ "unused", "resource" })
	void read()  {
		
		System.out.println("Enter the path to folder to search for files");
	    Scanner s1 = new Scanner(System.in);
	    String folderPath = s1.next();
	    File folder = new File(folderPath);
	           if (folder.isDirectory()) 
	           {
		         File[] listOfFiles = folder.listFiles();
		         if (listOfFiles.length < 1)System.out.println("There is no File inside Folder");
	            else { 
		        	  System.out.println("List of Files & Folder");
		         } 
		         File filesList[] = folder.listFiles();
			      System.out.println("List of files and directories in the specified directory:");
			      Scanner sc = null;
			      for(File file : filesList) {
			         System.out.println("File name: "+file.getName());
			         System.out.println("File path: "+file.getAbsolutePath());
			         System.out.println("Size :"+file.getTotalSpace());
			         //Instantiating the Scanner class
			         try {
						sc= new Scanner(file);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			         String input;
			         StringBuffer sb = new StringBuffer();
			         while (sc.hasNextLine()) {
			            input = sc.nextLine();
			            sb.append(input+" ");
			         }
			         System.out.println("Contents of the file: "+sb.toString());
			         System.out.println(" ");
			      }
	           }
	}
}
