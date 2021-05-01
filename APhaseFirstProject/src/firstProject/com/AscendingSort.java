// program to user path : all files in sorted form-------worked
package firstProject.com;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AscendingSort {
          @SuppressWarnings({ "unchecked", "unused", "rawtypes" })
		void sort() {
                          Scanner sr = new Scanner( System.in );
        	              System.out.println("Enter the file path:  ");
        	              String dirPath = sr.nextLine(); // Takes the directory path as the user input
        	              File folder = new File(dirPath);
        	              if(folder.isDirectory())
        	              {
        	                  File[] fileList = folder.listFiles();
        	                  Arrays.sort(fileList);
        	                  System.out.println("---------------------------------------------------");
        	    System.out.println("Total number of items present in the directory: " + fileList.length );
        	                  System.out.println("---------------------------------------------------");
        	                   System.out.println("file in ascending order:");
        	            // Lists only files since we have applied file filter
        	                  for(File file:fileList)
        	                  {
        	                      System.out.println(file.getName());
        	                  }// Creating a filter to return only files.
        	                  FileFilter fileFilter = new FileFilter()
        	                  {
	                           @Override
        	                      public boolean accept(File file) {
        	                          return !file.isDirectory();
        	                                 
        	                      }
        	                  };

        	              fileList = folder.listFiles(fileFilter);
        	               // Sort files by name
        	                  Arrays.sort(fileList, new Comparator()
        	                  {
        	                      @Override
        	                      public int compare(Object f1, Object f2) {
        	                          return ((File) f1).getName().compareTo(((File) f2).getName());
        	                      }
        	                  });
        	              	 
        	              
        	              }   
        	          }
        	  	}

