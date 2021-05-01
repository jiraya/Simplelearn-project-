// working program to delete file

package firstProject.com;
import java.io.File;
import java.util.Scanner;
//import java.util.Scanner;
public class DeleteFile {
@SuppressWarnings({ "resource", "unused" })
 static void delete() {
	System.out.println("Enter the path to folder to Delete Files" );
    Scanner s1 = new Scanner(System.in);
    String folderPath = s1.next();
    File folder = new File(folderPath);
   // delete simple file
			File myObj = new File(folderPath); 
		    if (myObj.delete()) { 
		      System.out.println("File Deleted: " + myObj.getName() + "  successfully");
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
}
}