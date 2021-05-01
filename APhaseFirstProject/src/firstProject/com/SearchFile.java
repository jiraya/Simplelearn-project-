package firstProject.com;
import java.io.File;
import java.util.Scanner;
public class SearchFile {
	public static void time() {
		
		 SearchFile ff = new SearchFile();
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the file to be searched.. " );
	        String name = scan.next();
	        System.out.println("Enter the directory where to search ");
	        String directory = scan.next();
	        ff.search(name,new File(directory));
	        System.out.println("file found  " +name );
	    }
		
		public void search(String name,File file) {
			File[] list = file.listFiles();
	        if(list!=null)
	        for (File fil : list)
	        {
	            if (fil.isDirectory())
	            {
	            	search(name,fil);
	            }
	            else if (name.equalsIgnoreCase(fil.getName()))
	            {
	                System.out.println(fil.getParentFile());
	            }
	            }
		}
}
	  
